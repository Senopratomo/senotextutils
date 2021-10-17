<h1>SenoTextUtils</h1>

<p>SenoTextUtils is a simple CLI tool that help with string text manipulation, encoding, decoding from different format.</p>
<ul>It accept two arguments:
    <li>command (see below "All available commands")</li>
    <li>String (text) to manipulate.</li>
</ul>

<h3>All available commands</h3>
<p>the available commands are:</p>
<ul>
    <li>base64encode<br />
       It encode a string in Base64 and print the Base64-encoded string input             
    </li>
    <li>base64decode<br />
       It decode a Base64 string and print the output
    </li>
    <li>urlencode<br />
        It encode a string and url-encode special characters
    </li>
    <li>urldecode<br />
        It decode a-url-encoded string and print the output
    </li>
</ul>

<h3>Sample Usage</h3>
<ul>
    <li>To see this instruction / help, execute it without any argument:<br />
       <code>$./senotextutils</code>             
    </li>
    <li>To encode a text 'hello' in Base64<br />
       <code>$./senotextutils base64encode "hello"</code>
    </li>
    <li>To decode a base64-encoded text 'aGVsbG8='<br />
        <code>$./senotextutils base64decode "aGVsbG8="</code>
    </li>
</ul>

<p>If encounter any issues, please submit it under this repository 'issues'</p>
