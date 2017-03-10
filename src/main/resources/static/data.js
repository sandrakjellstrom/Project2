var adventure = {
  title: "The super awesome game.",
  pages: {
  	start: {
        title: "Room",
        subTitle: "How many chairs do you want?",
        imageUrl: "https://lh6.googleusercontent.com/-z13tfXPJ52w/AAAAAAAAAAI/AAAAAAAAD_k/pAcfm603Yl0/photo.jpg",
        options: [
            {text:"I want 4 chairs", target:"four"},
            {text:"I want 8 chairs", target:"eight"},
            {text:"I want 10 chairs", target:"ten"}
            ]
	},
	four: {
		title: "Room",
   	 	subTitle: "4 chairs",
        imageUrl: [
			{text:"https://lh6.googleusercontent.com/-z13tfXPJ52w/AAAAAAAAAAI/AAAAAAAAD_k/pAcfm603Yl0/photo.jpg>"},
            {text:"https://lh6.googleusercontent.com/-z13tfXPJ52w/AAAAAAAAAAI/AAAAAAAAD_k/pAcfm603Yl0/photo.jpg>"},
			],
    	description: "These rooms have 4 chairs and Tv, Paperboard",
		name: [
			{text:"Snyder,"},
            {text:"Boestad,"},
            {text:"Hopper,"},
            {text:"Jenning"},
		],
    	options: [
	      {text:"I want 8 chairs", target:"eight"},
	      {text:"I want 10 chairs", target:"ten"}
	    ]
	},
	eight: {
		title: "Room",
   	 	subTitle: "8 chairs",
        imageUrl: "https://lh6.googleusercontent.com/-z13tfXPJ52w/AAAAAAAAAAI/AAAAAAAAD_k/pAcfm603Yl0/photo.jpg",
    	description: "This room have 8 chairs and have Tv, Paperboard",
        name: [
            {text:"Lovelace"},
        ],
    	options: [
	      {text:"I want 4 chairs", target:"four"},
	      {text:"I want 10 chairs", target:"ten"}
	    ]
	},
	ten: {
		title: "Room",
   	 	subTitle: "10 chairs",
        imageUrl: "https://lh6.googleusercontent.com/-z13tfXPJ52w/AAAAAAAAAAI/AAAAAAAAD_k/pAcfm603Yl0/photo.jpg",
    	description: "This room have 10 chairs and tv, whiteboard",
        name: [
            {text:"BigConf"},
        ],
		options: [
    		{text:"I want 4 chairs", target:"four"},
            {text:"I want 8 chairs", target:"eight"},
	    ]
	}
  }
};