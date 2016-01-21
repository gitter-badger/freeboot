
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.1.0/styles/default.min.css">
    <link href="css/style.css" rel="stylesheet">
    
	<title>freeboot.io</title>
  </head>
  <body>

    <div class="container-fluid content-wrapper">
	<div class="row">
		<div class="col-md-12">
			<#include "/navbar.ftl">
		</div>
	</div>
	<div class="row">
		<#include "/explainer.ftl">
		<div class="col-md-12">
			<div class="page-header">
				<h1>
					Generator <small>0.3.0-ALPHA</small>
				</h1>
			</div>
		</div>
		<div class="col-md-12">
			<div class="tabbable" id="tabs-700440">
				<ul class="nav nav-tabs">
					<li class="active">
						<a href="#panel-model" data-toggle="tab">Model</a>
					</li>
					<li>
						<a href="#panel-controller" data-toggle="tab">Controller</a>
					</li>
					<li>
						<a href="#panel-interface" data-toggle="tab">Interface</a>
					</li>
					<li>
						<a href="#panel-service" data-toggle="tab">Service</a>
					</li>
					<li>
						<a href="#panel-repository" data-toggle="tab">Repository</a>
					</li>
					<li>
						<a href="#panel-rest-client" data-toggle="tab">Rest Client</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-model">
						<#include "/entity-model.ftl">
						<div class="col-md-12">
							<div class="page-header">
								<h1>
									Instructions
								</h1>
							</div>
						</div>
						<hr />
						<#include "/instructions.ftl">	
					</div>
					<div class="tab-pane" id="panel-controller">
						<p>
							<pre>
								<code class="java hljs" id="controller-code"></code>
							</pre>
						</p>
					</div>
					<div class="tab-pane" id="panel-interface">
						<p>
							<pre>
								<code class="java hljs" id="interface-code"></code>
							</pre>
						</p>
					</div>
					<div class="tab-pane" id="panel-service">
						<p>
							<pre>
								<code class="java hljs" id="service-code"></code>
							</pre>
						</p>
					</div>
					<div class="tab-pane" id="panel-repository">
						<p>
							<pre>
								<code class="java hljs" id="repository-code"></code>
							</pre>
						</p>
					</div>
					<div class="tab-pane" id="panel-rest-client">
						<p>
							<pre>
								<code class="java hljs" id="rest-client-code"></code>
							</pre>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.1.0/highlight.min.js"></script>
	<script>hljs.initHighlightingOnLoad();</script>
    <script src="js/scripts.js"></script>
  </body>
</html>