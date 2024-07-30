%-------------------------
% Resume in Latex
% Author : Jake Gutierrez
% Based off of: https://github.com/sb2nov/resume
% License : MIT
%------------------------

\documentclass[letterpaper,11pt]{article}

\usepackage{latexsym}
\usepackage[empty]{fullpage}
\usepackage{titlesec}
\usepackage{marvosym}
\usepackage[usenames,dvipsnames]{color}
\usepackage{verbatim}
\usepackage{enumitem}
\usepackage[hidelinks]{hyperref}
\usepackage{fancyhdr}
\usepackage[english]{babel}
\usepackage{tabularx}
\input{glyphtounicode}


%----------FONT OPTIONS----------
% sans-serif
% \usepackage[sfdefault]{FiraSans}
% \usepackage[sfdefault]{roboto}
% \usepackage[sfdefault]{noto-sans}
% \usepackage[default]{sourcesanspro}

% serif
% \usepackage{CormorantGaramond}
% \usepackage{charter}


\pagestyle{fancy}
\fancyhf{} % clear all header and footer fields
\fancyfoot{}
\renewcommand{\headrulewidth}{0pt}
\renewcommand{\footrulewidth}{0pt}

% Adjust margins
\addtolength{\oddsidemargin}{-0.5in}
\addtolength{\evensidemargin}{-0.5in}
\addtolength{\textwidth}{1in}
\addtolength{\topmargin}{-.5in}
\addtolength{\textheight}{1.0in}

\urlstyle{same}

\raggedbottom
\raggedright
\setlength{\tabcolsep}{0in}

% Sections formatting
\titleformat{\section}{
  \vspace{-4pt}\scshape\raggedright\large
}{}{0em}{}[\color{black}\titlerule \vspace{-5pt}]

% Ensure that generate pdf is machine readable/ATS parsable
\pdfgentounicode=1

%-------------------------
% Custom commands
\newcommand{\resumeItem}[1]{
  \item\small{
    {#1 \vspace{-2pt}}
  }
}

\newcommand{\resumeSubheading}[4]{
  \vspace{-2pt}\item
    \begin{tabular*}{0.97\textwidth}[t]{l@{\extracolsep{\fill}}r}
      \textbf{#1} & #2 \\
      \textit{\small#3} & \textit{\small #4} \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeSubSubheading}[2]{
    \item
    \begin{tabular*}{0.97\textwidth}{l@{\extracolsep{\fill}}r}
      \textit{\small#1} & \textit{\small #2} \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeProjectHeading}[2]{
    \item
    \begin{tabular*}{0.97\textwidth}{l@{\extracolsep{\fill}}r}
      \small#1 & #2 \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeSubItem}[1]{\resumeItem{#1}\vspace{-4pt}}

\renewcommand\labelitemii{$\vcenter{\hbox{\tiny$\bullet$}}$}

\newcommand{\resumeSubHeadingListStart}{\begin{itemize}[leftmargin=0.15in, label={}]}
\newcommand{\resumeSubHeadingListEnd}{\end{itemize}}
\newcommand{\resumeItemListStart}{\begin{itemize}}
\newcommand{\resumeItemListEnd}{\end{itemize}\vspace{-5pt}}

%-------------------------------------------
%%%%%%  RESUME STARTS HERE  %%%%%%%%%%%%%%%%%%%%%%%%%%%%


\begin{document}

\begin{center}
    \textbf{\Huge \scshape RENUKA}
\end{center}


%-----------EDUCATION-----------
\section{Education}
  \resumeSubHeadingListStart
    \resumeSubheading
      {Sharnabasava University,Kalburgi}{Sept. 2020 -- May 2024}
      {Computer Science And Engineering }{CGPA 8.45}
  \resumeSubHeadingListEnd


%-----------Extracurriculars-----------
\section{PROJECTS}
  \resumeSubHeadingListStart

    \resumeSubheading
      {Automatic Waste Segregator Using IOT}{feb.2024 -- may.2024}
      {Treasurer}{8th sem}
      \resumeItemListStart
        \resumeItem{	Designed and implemented an automatic waste segregation system to categorize waste into different bins (e.g.dry,wet,metallic) using IoT technologies..}
        \resumeItem{	Developed the overall architecture of the waste segregator, including hardware and software components.}
        \resumeItem{	Programming Languages: C, C++ IoT, Platforms: Arduino ,Software Tools: blynk app.}
    
      \resumeItemListEnd
      
    \resumeSubheading
      {Heart Disease Prediction}{nov.2023 -jan.2024}
      {Front-End Development}{7th sem}
      \resumeItemListStart
        \resumeItem{techniques and models to estimate the likelihood that an individual will develop heart disease. \textbf{web  technologies CSS,HTML page to recive patient data.}}
        \resumeItem{Machine Learning Traditional methods like  \textbf{logistic regression,support vector machines SVM} model to predict probabilities of heart disease.}
        \resumeItem{}
      \resumeItemListEnd
    
    \resumeSubheading
      {Varsity Swim Team}{Sep. 2021 -- June 2024}
      {Team Captain}{Brooklyn, NY}
      \resumeItemListStart
        \resumeItem{Led the varsity swim team to its \textbf{inaugural section championship} through leadership and strategic planning.}
        \resumeItem{Mentored junior team members, providing guidance on proper techniques, race preparation, and sportsmanship.}
    \resumeItemListEnd

  \resumeSubHeadingListEnd


%-----------Experience-----------
\section{Experience}
  \resumeSubHeadingListStart

    \resumeSubheading
      {INTERNSHIP}{feb.2024 -may.2024}
      {Digisnare Technologies}{Kalburgi}
      \resumeItemListStart
        \resumeItem{\textbf{}developed web application project 'College admission management system'helps students register,update details and recive notifications.}
        \resumeItem{front-end technologies used html,css,javascript to  create web page.}
        \resumeItem{back-end technologies mysql to store data ,xampp server to perfom web appliction  .}
        \resumeItem{vscode,git/github }
      \resumeItemListEnd
      
    \resumeSubheading
      {small javascript project}{}
      {Team Captai}{}
      \resumeItemListStart
        \resumeItem{Designed a captivating set of projects, including a Rock-Paper-Scissors game }
        \resumeItem{Tip Calculator, and a Color Flipper, all meticulously crafted using css,html,javascript reinforce fundamental concepts.}
        \resumeItemListEnd

  \resumeSubHeadingListEnd


\section{CERTIFICATION}
    \resumeSubHeadingListStart
      \resumeSubheading
      {Speedo Scholastic All-American}{may.2024 }
      {}{}
      \resumeItemListStart
      \vspace{-4mm}
        \resumeItem{ \textbf{nat.}
      \resumeItemListEnd
      
    \resumeSubheading
      {National Junior Honor Society}{June 2023 -- Present}
      {}{}
      \resumeItemListStart
      \vspace{-4mm}
        \resumeItem{Award presented to students with outstanding achievements in academics, leadership, and community service.}
      \resumeItemListEnd
    \resumeSubHeadingListEnd

%-----------Courses-----------
\section{Classes}
 \begin{itemize}[leftmargin=0.15in, label={}]
    \small{\item{
    \vspace{1mm}
     \textbf{Courses}{: AP Calulus BC, AP Chemistry, AP Physics, AP World History, AP U.S. History, AP Statistics, AP Literature} \\

    }}
 \end{itemize}

%-----------Skill and Interests-----------
\section{Skills \& Interests}
 \begin{itemize}[leftmargin=0.15in, label={}]
    \small{\item{
    \vspace{1mm}
     \textbf{Skills}{: Probability Theory, Web Design, Microsoft Excel, Microsoft Office} \\
     \vspace{1mm}
     \textbf{Interests}{: Photography, Creative Writing, Archery, New York Knicks} \\
     \vspace{1mm}

    }}
 \end{itemize}
 \begin{center}
    
\small 123-456-7890 $|$
\href{mailto:ADD EMAIL HERE@x.com}{\underline{andrew@gmail.com}} $|$
\href{ADD LINKEDIN PAGE HERE}{\underline{linkedin.com/in/andrew}} 
\end{center}


\end{document}