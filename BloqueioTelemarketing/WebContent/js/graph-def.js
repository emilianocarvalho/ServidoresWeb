if(!!(window.addEventListener)) window.addEventListener('DOMContentLoaded', main);
else window.attachEvent('onload', main);

function main() {
    Chart.defaults.global = {
        // Boolean - Whether to animate the chart
        animation: true,

        // Number - Number of animation steps
        animationSteps: 260,

        // String - Animation easing effect
        // Possible effects are:
        // [easeInOutQuart, linear, easeOutBounce, easeInBack, easeInOutQuad,
        //  easeOutQuart, easeOutQuad, easeInOutBounce, easeOutSine, easeInOutCubic,
        //  easeInExpo, easeInOutBack, easeInCirc, easeInOutElastic, easeOutBack,
        //  easeInQuad, easeInOutExpo, easeInQuart, easeOutQuint, easeInOutCirc,
        //  easeInSine, easeOutExpo, easeOutCirc, easeOutCubic, easeInQuint,
        //  easeInElastic, easeInOutSine, easeInOutQuint, easeInBounce,
        //  easeOutElastic, easeInCubic]
        animationEasing: "easeInOutSine",

        // Boolean - If we should show the scale at all
        showScale: true,

        // Boolean - If we want to override with a hard coded scale
        scaleOverride: false,

        // ** Required if scaleOverride is true **
        // Number - The number of steps in a hard coded scale
        scaleSteps: null,
        // Number - The value jump in the hard coded scale
        scaleStepWidth: null,
        // Number - The scale starting value
        scaleStartValue: null,

        // String - Colour of the scale line
        scaleLineColor: "rgba(0,0,0,.1)",

        // Number - Pixel width of the scale line
        scaleLineWidth: 1,

        // Boolean - Whether to show labels on the scale
        scaleShowLabels: true,

        // Interpolated JS string - can access value
        scaleLabel: "<%=value%>",

        // Boolean - Whether the scale should stick to integers, not floats even if drawing space is there
        scaleIntegersOnly: true,

        // Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
        scaleBeginAtZero: false,

        // String - Scale label font declaration for the scale label
        scaleFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

        // Number - Scale label font size in pixels
        scaleFontSize: 14,

        // String - Scale label font weight style
        scaleFontStyle: "normal",

        // String - Scale label font colour
        scaleFontColor: "#666",

        // Boolean - whether or not the chart should be responsive and resize when the browser does.
        responsive: true,

        // Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container
        maintainAspectRatio: true,

        // Boolean - Determines whether to draw tooltips on the canvas or not
        showTooltips: true,

        // Function - Determines whether to execute the customTooltips function instead of drawing the built in tooltips (See [Advanced - External Tooltips](#advanced-usage-custom-tooltips))
        customTooltips: false,

        // Array - Array of string names to attach tooltip events
        tooltipEvents: ["mousemove", "touchstart", "touchmove"],

        // String - Tooltip background colour
        tooltipFillColor: "rgba(0,0,0,0.8)",

        // String - Tooltip label font declaration for the scale label
        tooltipFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

        // Number - Tooltip label font size in pixels
        tooltipFontSize: 12,

        // String - Tooltip font weight style
        tooltipFontStyle: "normal",

        // String - Tooltip label font colour
        tooltipFontColor: "#fff",

        // String - Tooltip title font declaration for the scale label
        tooltipTitleFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

        // Number - Tooltip title font size in pixels
        tooltipTitleFontSize: 14,

        // String - Tooltip title font weight style
        tooltipTitleFontStyle: "bold",

        // String - Tooltip title font colour
        tooltipTitleFontColor: "#fff",

        // Number - pixel width of padding around tooltip text
        tooltipYPadding: 6,

        // Number - pixel width of padding around tooltip text
        tooltipXPadding: 6,

        // Number - Size of the caret on the tooltip
        tooltipCaretSize: 8,

        // Number - Pixel radius of the tooltip border
        tooltipCornerRadius: 6,

        // Number - Pixel offset from point x to tooltip edge
        tooltipXOffset: 10,

        // String - Template string for single tooltips
        tooltipTemplate: "<%if (label){%><%=label%>: <%}%><%= value %>",

        // String - Template string for multiple tooltips
        multiTooltipTemplate: "<%= value %>",

        // Function - Will fire on animation progression.
        onAnimationProgress: function(){},

        // Function - Will fire on animation completion.
        onAnimationComplete: function(){}
    };

    lineAtend();
    lineReclam();
    barsChart();
    pieChart();
    polarArea();
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

    legend(document.getElementById("lineLegend"), data, { scaleShowLabels: true,
});
}

function lineReclam() {
    var data = {
        labels : ["Pombal","Cajazeiras","Itaporanga","Unesc-CG","SEDE","Patos","São Bento"],
        datasets : [
            {
                fillColor : "rgba(320,187,205,0.5)",
                strokeColor : "rgba(320,187,205,1)",
                pointColor : "rgba(320,187,205,1)",
                pointStrokeColor : "#fff",
                data : [19,330,5,129,2800,150,0],
                label : 'ACUMULADO'
            },
            {
                fillColor : "rgba(220,220,220,0.5)",
                strokeColor : "rgba(220,220,220,1)",
                pointColor : "rgba(220,220,220,1)",
                pointStrokeColor : "#fff",
                data : [0,72,0,27,3,3,0],
                label : '16 MAR/2015'
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,1)",
                pointColor : "rgba(151,187,205,1)",
                pointStrokeColor : "#fff",
                data : [19,258,5,102,2797,147,14],
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
                data : [1, 91,1,172,2,313,51],
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
                data : [22,2047,34,1502,89,2482,1015],
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

    var ctx = document.getElementById("bars").getContext("2d");
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
    var pieChart = new Chart(ctx).Pie(data, {
        animationSteps: 160,
        animationEasing: "easeInOutQuart",
    });

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
