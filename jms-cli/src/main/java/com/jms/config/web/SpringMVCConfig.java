�}�)    `DB :j�u
��� �a1�Bq}n퓬;�zJ6�뛞sc���6�,D38ލaM���gI|C!'�?4�΄���L��dS˖s��HV,\��x>��×)L~-6�y2�ɐ]G����2�Q�]~g��\d�,�׃�*>��qYjO��x�F�B::K���T��Č�	�q�/1*%�c8�ШǷ�2�-��j\�`'8("nK08
���H�՜�)UU�r��w��C���:�����4��
;�t���;.p`��,��{2'��ϖa��a�H��;)S��ԳL��P��|�� �`nl5��vp�ګdx;C"�B��P�����ߨ�$E�֤�s���J�:��	��]Ger�߼�*�jSʻē��]��(�d�ABG��ĹXE�%��κ|�����]�ଁJ��z �*{�=nܷv8�"�v�7��>�5��AbI!�������
��,2����58��
�ڑmHr�gޒ3�ᕿ{H��éX{��jean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
}
