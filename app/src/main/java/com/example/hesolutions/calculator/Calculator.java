package com.example.hesolutions.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView result, equation;
    Button Number0,Number1,Number2,Number3,Number4,Number5,Number6,Number7,Number8,Number9,
            C, CE, plus, minus, mutiple, devide, equal, D, decimal, negative;
    private boolean equclean = true;
    private boolean numclean = true;
    private boolean wrong = true;
    private double internal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = (TextView)findViewById(R.id.result);
        equation = (TextView)findViewById(R.id.equation);
        Number0 = (Button)findViewById(R.id.Number0);
        Number1 = (Button)findViewById(R.id.Number1);
        Number2 = (Button)findViewById(R.id.Number2);
        Number3 = (Button)findViewById(R.id.Number3);
        Number4 = (Button)findViewById(R.id.Number4);
        Number5 = (Button)findViewById(R.id.Number5);
        Number6 = (Button)findViewById(R.id.Number6);
        Number7 = (Button)findViewById(R.id.Number7);
        Number8 = (Button)findViewById(R.id.Number8);
        Number9 = (Button)findViewById(R.id.Number9);
        C = (Button)findViewById(R.id.C);
        CE = (Button)findViewById(R.id.CE);
        D = (Button)findViewById(R.id.D);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        mutiple = (Button)findViewById(R.id.mutiple);
        devide = (Button)findViewById(R.id.devide);
        equal = (Button)findViewById(R.id.equal);
        decimal = (Button)findViewById(R.id.decimal);
        negative = (Button)findViewById(R.id.negative);


        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong==false){
                    internal = 0;
                    equation.setText("");
                }
                result.setText("0");
                wrong = true;
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                equation.setText("");
                wrong = true;
                internal = 0;
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    if (!result.getText().toString().equals("0")) {
                        String number = result.getText().toString();
                        if (number.length() == 1) {
                            result.setText("0");
                        } else {
                            String newnumber = number.substring(0, number.length() - 1);
                            result.setText(newnumber);
                        }
                    }
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    String resultnumber = result.getText().toString();
                    if (!resultnumber.contains(".")) {
                        resultnumber = resultnumber + ".";
                        result.setText(resultnumber);
                    }
                }
            }
        });

        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    String resultnumber = result.getText().toString();
                    double value = Double.parseDouble(resultnumber);
                    if (!resultnumber.contains("-") && value != 0) {
                        value = -value;
                        long ipart = (long) value;
                        double fpart = value - ipart;
                        if (fpart == 0.0) {
                            result.setText(Long.toString(ipart));
                        } else {
                            result.setText(Double.toString(value));
                        }
                    }
                }
            }
        });

        Number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0") && !resultnumber.contains(".")) {
                        result.setText("0");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "0";
                        result.setText(number);
                    }
                }
            }
        });

        Number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0") && !resultnumber.contains(".")) {
                        result.setText("1");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "1";
                        result.setText(number);
                    }
                }
            }
        });

        Number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("2");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "2";
                        result.setText(number);
                    }
                }
            }
        });

        Number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("3");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "3";
                        result.setText(number);
                    }
                }
            }
        });

        Number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("4");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "4";
                        result.setText(number);
                    }
                }
            }
        });

        Number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("5");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "5";
                        result.setText(number);
                    }
                }
            }
        });

        Number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("6");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "6";
                        result.setText(number);
                    }
                }
            }
        });

        Number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("7");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "7";
                        result.setText(number);
                    }
                }
            }
        });

        Number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("8");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "8";
                        result.setText(number);
                    }
                }
            }
        });

        Number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    numclean = true;
                    String resultnumber = result.getText().toString();
                    if (equclean == true || resultnumber.equals("0")&& !resultnumber.contains(".")) {
                        result.setText("9");
                        equclean = false;
                    } else {
                        String number = result.getText().toString();
                        number = number + "9";
                        result.setText(number);
                    }
                }
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    equclean = true;
                    if (numclean == true) {
                        numclean = false;
                        if (result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText("0+");
                            result.setText("0");
                        } else if (!result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText(result.getText().toString() + "+");
                            internal = Double.parseDouble(result.getText().toString());
                        } else {
                            String equationnumber = equation.getText().toString();
                            String resultnumber = result.getText().toString();
                            State value =  Calculation(equationnumber, resultnumber);
                            boolean error = value.getError();
                            if (error == true) {
                                internal = value.getNumber();
                                long ipart = (long) internal;
                                double fpart = internal - ipart;
                                if (fpart == 0.0) {
                                    result.setText(Long.toString(ipart));
                                } else {
                                    result.setText(Double.toString(internal));
                                }
                            }else {
                                result.setText(R.string.error_message);
                            }
                            equationnumber = equationnumber + resultnumber + "+";
                            equation.setText(equationnumber);
                        }
                    } else {
                        String equationnumber = equation.getText().toString();
                        StringBuilder newequation = new StringBuilder(equationnumber);
                        newequation.setCharAt(equationnumber.length() - 1, '+');
                        equation.setText(newequation);
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    equclean = true;
                    if (numclean == true) {
                        numclean = false;
                        if (result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText("0-");
                            result.setText("0");
                        }else if (!result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText(result.getText().toString() + "-");
                            internal = Double.parseDouble(result.getText().toString());
                        } else {
                            String equationnumber = equation.getText().toString();
                            String resultnumber = result.getText().toString();
                            State value =  Calculation(equationnumber, resultnumber);
                            boolean error = value.getError();
                            if (error == true) {
                                internal = value.getNumber();
                                long ipart = (long) internal;
                                double fpart = internal - ipart;
                                if (fpart == 0.0) {
                                    result.setText(Long.toString(ipart));
                                } else {
                                    result.setText(Double.toString(internal));
                                }
                            }else {
                                result.setText(R.string.error_message);
                            }
                            equationnumber = equationnumber + resultnumber + "-";
                            equation.setText(equationnumber);
                        }
                    } else {
                        String equationnumber = equation.getText().toString();
                        StringBuilder newequation = new StringBuilder(equationnumber);
                        newequation.setCharAt(equationnumber.length() - 1, '-');
                        equation.setText(newequation);
                    }
                }
            }
        });

        mutiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    equclean = true;
                    if (numclean == true) {
                        numclean = false;
                        if (result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText("0*");
                            result.setText("0");
                        } else if (!result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText(result.getText().toString() + "*");
                            internal = Double.parseDouble(result.getText().toString());
                        } else{
                            String equationnumber = equation.getText().toString();
                            String resultnumber = result.getText().toString();
                            State value =  Calculation(equationnumber, resultnumber);
                            boolean error = value.getError();
                            if (error == true) {
                                internal = value.getNumber();
                                long ipart = (long) internal;
                                double fpart = internal - ipart;
                                if (fpart == 0.0) {
                                    result.setText(Long.toString(ipart));
                                } else {
                                    result.setText(Double.toString(internal));
                                }
                            }else {
                                result.setText(R.string.error_message);
                            }
                            equationnumber = equationnumber + resultnumber + "*";
                            equation.setText(equationnumber);
                        }
                    } else {
                        String equationnumber = equation.getText().toString();
                        StringBuilder newequation = new StringBuilder(equationnumber);
                        newequation.setCharAt(equationnumber.length() - 1, '*');
                        equation.setText(newequation);
                    }
                }
            }
        });


        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    equclean = true;
                    if (numclean == true) {
                        numclean = false;
                        if (result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText("0/");
                            result.setText(R.string.error_message);
                            wrong = false;
                        } else if (!result.getText().toString().equals("0") && equation.getText().toString().equals("")) {
                            equation.setText(result.getText().toString() + "/");
                            internal = Double.parseDouble(result.getText().toString());
                        } else {
                            String equationnumber = equation.getText().toString();
                            String resultnumber = result.getText().toString();
                            State value = Calculation(equationnumber, resultnumber);
                            boolean error = value.getError();
                            if (error == true) {
                                internal = value.getNumber();
                                long ipart = (long) internal;
                                double fpart = internal - ipart;
                                if (fpart == 0.0) {
                                    result.setText(Long.toString(ipart));
                                } else {
                                    result.setText(Double.toString(internal));
                                }
                            } else {
                                result.setText(R.string.error_message);
                            }
                            equationnumber = equationnumber + resultnumber + "/";
                            equation.setText(equationnumber);
                        }
                    } else {
                        String equationnumber = equation.getText().toString();
                        StringBuilder newequation = new StringBuilder(equationnumber);
                        newequation.setCharAt(equationnumber.length() - 1, '/');
                        equation.setText(newequation);
                    }
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wrong == true) {
                    equclean = true;
                    if (equation.getText().toString().equals("")) {
                    } else if (!equation.getText().toString().equals("")) {
                        double resultnumber = Double.parseDouble(result.getText().toString());
                        String equationnumber = equation.getText().toString();
                        String lastdigit = equationnumber.substring(equationnumber.length() - 1, equationnumber.length());
                        if (lastdigit.equals("/") && resultnumber == 0) {
                            result.setText(R.string.error_message);
                            wrong = false;
                        } else {
                            switch (lastdigit) {
                                case "+":
                                    internal += resultnumber;
                                    break;
                                case "-":
                                    internal -= resultnumber;
                                    break;
                                case "*":
                                    internal *= resultnumber;
                                    break;
                                case "/":
                                    internal /= resultnumber;
                                    break;
                            }
                            long ipart = (long) internal;
                            double fpart = internal - ipart;
                            if (fpart == 0.0) {
                                result.setText(Long.toString(ipart));
                            } else {
                                result.setText(Double.toString(internal));
                            }
                        }

                        equation.setText("");
                    }
                }
            }
        });
    }

    public State Calculation(String equation, String result)
    {
        String lastdigit = equation.substring(equation.length() - 1, equation.length());
        double resultnumber = Double.parseDouble(result);
        State state = new State(resultnumber, true);
        switch (lastdigit) {
            case "+":
                internal += resultnumber;
                state = new State(internal, true);
                break;
            case "-":
                internal -= resultnumber;
                state = new State(internal, true);
                break;
            case "*":
                internal *= resultnumber;
                state = new State(internal, true);
                break;
            case "/":
                if (resultnumber == 0){
                    wrong = false;
                    state = new State(internal, false);
                }else {
                    internal /= resultnumber;
                    state = new State(internal, true);
                }
                break;
        }
        return state;
    }

    private class State
    {
        double number;
        boolean error;
        public State(double number, boolean error)
        {
            this.number = number;
            this.error = error;
        }
        public boolean getError() {return this.error;}
        public double getNumber() {return this.number;}
    }
}
