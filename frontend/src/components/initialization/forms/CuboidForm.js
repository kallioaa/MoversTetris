import React, { useState } from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

const CuboidForm = (props) => {
  const [state, setState] = useState({
    name: '',
    length: '',
    width: '',
    height: '',
    weight: '',
    demand: '',
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
    props.addCuboid(state);
    props.handleClose();
  };

  return (
    <Form onSubmit={handleSubmit}>
      <Form.Group>
        <Form.Control type='text' className='form-control' name='name' placeholder='Name' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='length' placeholder='Length' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='width' placeholder='Width' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='height' placeholder='Height' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='weight' placeholder='Weight' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Form.Control type='number' className='form-control' name='demand' placeholder='Demand' min='1' max='100000' required onChange={handleChange} />
        <br />
        <Button className='float-right' type='submit'>
          Add Cuboid
        </Button>
      </Form.Group>
    </Form>
  );
};

export default CuboidForm;
