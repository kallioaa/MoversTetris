import React, { useState } from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

const ContainerForm = (props) => {
  const [state, setState] = useState({
    name: '',
    length: '',
    width: '',
    height: '',
    maxWeight: '',
  });

  const handleChange = (event) => {
    const { name, value } = event.target;
    if (name !== 'name') {
      setState({ ...state, [name]: parseInt(value) });
    } else {
      setState({ ...state, name: value });
    }
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    props.addContainer(state);
    props.handleClose();
  };

  return (
    <Form onSubmit={handleSubmit}>
      <Form.Group>
        <Form.Control type='text' className='form-control' name='name' placeholder='Name' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='length' placeholder='Length' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='width' placeholder='Width' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='height' placeholder='Height' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='maxWeight' placeholder='Max Weight' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Button className='float-right' type='submit'>
          Add Container
        </Button>
      </Form.Group>
    </Form>
  );
};

export default ContainerForm;
