�}p)    ����'��j�u
��� �a1��q������RGYn�.���6��.��t�����Id����-����0A��`p,��h�H���\pl����G���یPo��1�/NR��=��ZҊ���n̲)*�e�$F�Qo��o��Y��\SJ��|ۃ�{���U+8#z�i.�_���%��!~n��
���ݓ��ޢ��$���0�DW��AV�p�,�)ରj�w���zvũi��?��g8�4��
;�t���;.p`��,��{2'��ϖa��a�H��;)S��ԳL��P��|�� �`nl5��vp�ګdx;C"�B��P�����ߨ�$E�֤�s���J�:��	��]Ger�߼�*�jSʻē��]��(�d�ABG��ĹXE�%��κ|�����]�ଁJ��z �*{�=nܷv8�"�v�7��>�5��AbI!�������
��,2����58��
�ڑmHr�gޒ3�ᕿ{H��éX{��jl(ʹ����6r�Z�v�e�w�;?���Z����M�v�蝥%�+�Rkµc�b-�p����/����tk�%�y����-3\������w�3e����5n��Y��C���8⼢�E������*-���Sq����8ތM��eQ�p?5��8���8�������W��_$���3x}�.vfs�^���{�^l]�4K����I==1=�q�24�_�ųot���*:cY4T{��j,����9����л|r��.����5~��-X<t�J6=�+J_�� �9��� !t��s��<T,(�]�CzSF^2]u�
	�i����l�{�=�K�9F��w\��}�)).�*oJ�P54΀;�ԫc�C+�7����_܆�B�IE�߹�"����}��=yZ�d���(3�g��j���g��h'*��G>kn���E��� V�H�;�-7������@�����0<�#�ࡦR���sM�p!Ѕf�Ygm��lD[.���ڌ��Ċ�f3�G1��͙����!���0;��G9�5��	� ����s�q�Q��5F�� T��:9E��_�8L��?��>{�U �� �P�R�#���������i�g�s�G�SC��%����G��Io��3��`w���׾���K�C%z�z.�hb?�QsD�^�>��HHc2"�F���y���Yd �@n��xITk�-�~)��i%,<X-m�_��M?
�W�lN��&��;�*�p���\���y�~���H�e�#1ѭ���W(�����2��	B =(*�Y��is`�=��KV�@��
��%�Lyѝa�1th�`c����#���X�Ƣ�`���D.����j\]��+��h1��B��A����KL~euYl�e�t-ZDC�4���������ȫQ4�� :q�M���H�_B�N���?���u���r�ѡ�
+�lY�*-�f�(�Gǟm�3[#$>�����5Fl�B�@��vP�2 queue) {
		JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
		jmsTemplate.setMessageConverter(messageConverter);
		jmsTemplate.setDefaultDestination(queue);
		return jmsTemplate;
	}

}
