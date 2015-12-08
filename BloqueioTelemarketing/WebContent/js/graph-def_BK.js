if(!!(window.addEventListener)) window.addEventListener('DOMContentLoaded', main);
else window.attachEvent('onload', main);

function main() {
    lineAtend();
    lineChart();
    barsChart();
    barsReclAr();
    pieChart();
    doughnutChart();
    polarArea();
    radarArea();
}

function lineAtend() {
    var data = {
        labels : ["Cajazeiras","Jaguaribe","Unesc-CG","Procon-PB","Patos","São Bento","Itaporanga", "Pombal", "Guarabira"],
        datasets : [
            {
                fillColor : "rgba(320,187,205,0.5)",
                strokeColor : "rgba(320,187,205,1)",
                pointColor : "rgba(320,187,205,1)",
                pointStrokeColor : "#fff",
                data : [587,34,206,6062,275,34,72,38,111],
                label : 'ACUMULADO'
            },
            {
                fillColor : "rgba(220,220,220,0.5)",
                strokeColor : "rgba(220,220,220,1)",
                pointColor : "rgba(220,220,220,1)",
                pointStrokeColor : "#fff",
                data : [148,1,46,412,23,17,31,19,48],
                label : '16 MAR/2015'
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,1)",
                pointColor : "rgba(151,187,205,1)",
                pointStrokeColor : "#fff",
                data : [439,33,160,5650,252,17,41,19,63],
                label : '22 OUT/2015'
            }
        ]
    };

    var ctx = document.getElementById("lineChart").getContext("2d");
    new Chart(ctx).Line(data);

    legend(document.getElementById("lineLegend"), data);
}

function lineChart() {
    var data = {
        labels : ["Cajazeiras","Jaguaribe","Unesc-CG","Procon-PB","Patos","São Bento","Itaporanga", "Pombal", "Guarabira"],
        datasets : [
            {
                fillColor : "rgba(320,187,205,0.5)",
                strokeColor : "rgba(320,187,205,1)",
                pointColor : "rgba(320,187,205,1)",
                pointStrokeColor : "#fff",
                data : [587,34,206,6062,275,34,72,38,111],
                label : 'ACUMULADO'
            },
            {
                fillColor : "rgba(220,220,220,0.5)",
                strokeColor : "rgba(220,220,220,1)",
                pointColor : "rgba(220,220,220,1)",
                pointStrokeColor : "#fff",
                data : [148,1,46,412,23,17,31,19,48],
                label : '16 MAR/2015'
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,1)",
                pointColor : "rgba(151,187,205,1)",
                pointStrokeColor : "#fff",
                data : [439,33,160,5650,252,17,41,19,63],
                label : '22 OUT/2015'
            }
        ]
    };

    var ctx = document.getElementById("lineReclam").getContext("2d");
    new Chart(ctx).Line(data);

    legend(document.getElementById("lineReclCh"), data);
}


function barsChart() {
    var data = {
        labels : ["Alimentos","Assuntos Financeiros","Habitação","Produtos","Saúde","Serviços Essenciais","Serviços Privados"],
        datasets : [
            {
                fillColor : "rgba(220,220,220,0.5)",
                strokeColor : "rgba(220,220,220,1)",
                pointColor : "rgba(220,220,220,1)",
                pointStrokeColor : "#fff",
                data : [0, 91,1,172,2,313,51],
                label : '16 MAR/2015'
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,1)",
                pointColor : "rgba(151,187,205,1)",
                pointStrokeColor : "#fff",
                data : [22,1956,33,1330,87,2169,964],
                label : '22 OUT/2015'
            },
            {
                fillColor : "rgba(320,187,205,0.5)",
                strokeColor : "rgba(320,187,205,1)",
                pointColor : "rgba(320,187,205,1)",
                pointStrokeColor : "#fff",
                data : [600,300,250,5400,420,25,251],
                label : 'ACUMULADO'
            }

        ]
    };

    var ctx = document.getElementById("barsChart").getContext("2d");
    new Chart(ctx).Bar(data);

    legend(document.getElementById("barsLegend"), data);
}

function barsReclAr() {
    var data = {
        labels : ["Alimentos","Assuntos Financeiros","Habitação","Produtos","Saúde","Serviços Essenciais","Serviços Privados"],
        datasets : [
            {
                fillColor : "rgba(220,220,220,0.5)",
                strokeColor : "rgba(220,220,220,1)",
                pointColor : "rgba(220,220,220,1)",
                pointStrokeColor : "#fff",
                data : [0,28,1,64,1,9,2],
                label : '16 MAR/2015'
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,1)",
                pointColor : "rgba(151,187,205,1)",
                pointStrokeColor : "#fff",
                data : [18,948,29,1075,67,830,375],
                label : '22 OUT/2015'
            },
            {
                fillColor : "rgba(320,187,205,0.5)",
                strokeColor : "rgba(320,187,205,1)",
                pointColor : "rgba(320,187,205,1)",
                pointStrokeColor : "#fff",
                data : [18,976,30,1139,68,839,377],
                label : 'ACUMULADO'
            }

        ]
    };

    var ctx = document.getElementById("barsChart").getContext("2d");
    new Chart(ctx).Bar(data);

    legend(document.getElementById("barsLegend"), data);
}


function pieChart() {
    var data = [
        {
            value: 1130,
            color:"#F38630",
            label: 'Acordos'
        },
        {
            value : 998,
            color : "#E0E4CC",
            label: 'Remarcados'
        },
        {
            value : 743,
            color : "#69D2E7",
            label: 'Sem Acordo'
        }
    ];

    var ctx = document.getElementById("pieChart").getContext("2d");
    var pieChart = new Chart(ctx).Pie(data);

    legend(document.getElementById("pieLegend"), data, pieChart);
}

function doughnutChart() {
    var data = [
        {
            value: 40,
            color:"#F38630",
            label: 'Animals'
        },
        {
            value : 20,
            color : "#E0E4CC",
            label: 'People'
        },
        {
            value : 30,
            color : "#69D2E7",
            label: 'Aliens'
        }
    ];

    var ctx = document.getElementById("doughnutChart").getContext("2d");
    var doughnutChart = new Chart(ctx).Doughnut(data);

    legend(document.getElementById("doughnutLegend"), data, doughnutChart);
}


function polarArea() {
    var data = [
        {
            value: 1956,
            color: "#46BFBD",
            highlight: "#AAD3D1",
            label: "Assuntos Financeiros"
        },
        {
            value: 1330,
            color: "#F38630",
            highlight: "#A8B3C5",
            label: "Produtos"
        },
        {
            value: 2169,
            color: "#4D5360",
            highlight: "#616774",
            label: "Serviços Esssenciais"
        }
        ,
        {
            value: 964,
            color: "#55CC44",
            highlight: "#55AA44",
            label: "Serviços Privados"
        }
     ];

    var ctx = document.getElementById("polarChart").getContext("2d");
    var polarChart = new Chart(ctx).PolarArea(data);

    legend(document.getElementById("polarLegend"), data, polarChart);

}


function radarArea() {
    var data = {
        labels: ["Eating", "Drinking", "Sleeping", "Designing", "Coding", "Cycling", "Running"],
        datasets: [
            {
                label: "My First dataset",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                data: [65,59,90,81,56,55,40]
            },
            {
                label: "My Second dataset",
                fillColor: "rgba(151,187,205,0.2)",
                strokeColor: "rgba(151,187,205,1)",
                pointColor: "rgba(151,187,205,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(151,187,205,1)",
                data: [28,48,40,19,96,27,100]
            }
        ]
    };


    var ctx = document.getElementById("radarChart").getContext("2d");
    var radarChart = new Chart(ctx).Radar(data,{responsive: true});

    legend(document.getElementById("radarLegend"), data, radarChart);
}
