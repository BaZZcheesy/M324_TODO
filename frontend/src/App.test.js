import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import App from './App';


test('renders ToDo Liste title', () => {
  render(<App />);
  // Find the Text
  const linkElement = screen.getByText(/ToDo Liste/i);
  expect(linkElement).toBeInTheDocument();
  expect(linkElement).toBeVisible();
  expect(linkElement).toHaveClass("headline")
});

test('renders input field', () => {
  render(<App />);

  // Find the input field
  const inputElement = screen.getByRole('textbox');

  // Change the value of the inputField
  inputElement.value = "hello";

  // Check if value == "hello" + is in document
  expect(inputElement).toHaveValue("hello");
  expect(inputElement).toBeInTheDocument();
});