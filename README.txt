======================================================================
NyARToolKit for Android SDK
 version 3.0.0-1 (Android 2.1-update1)
  include NyARToolKit for Java 3.0.0(rpf exclude)

======================================================================

NyARToolKit for Android SDK
 Copyright (C)2010 R.Iizuka(nyatla)
 Copyright (C)2010 NyARToolkit for Android team

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

For further information please contact.
 http://sourceforge.jp/projects/nyartoolkit-and/

This work is based on the NyARToolKit developed by
  R.Iizuka (nyatla)
  http://nyatla.jp/nyatoolkit/

contributors
 Shinobu Izumi
 Noritsuna Imamura
 NyARToolkit for Android team members
  Atsuo Igarashi
  Fuu Rokubou

----------------------------------------------------------------------
 About NyARToolKit for Android SDK
----------------------------------------------------------------------
 * NyARToolKit の Android SDK 版です。
 * Android SDK 2.1-update1 platform(API level 7) 以上
 * A虎＠(nyatla)氏の NyARToolkit for Java v3.0.0 を基盤に作られているライブラリです
 * このライブラリは入力画像からマーカーを認識して、3次元空間でのマーカー位置を計算する部分まで行います。
 * ハードウェアに依存するカメラ部分は機種に合わせて作成する必要があります
 * 3D グラフィックスとの合成などは各自で実装する事が可能です
 * min3d を用いた表示のサンプルが含まれています

 # Android SDK ported version of NyARToolKit.
 # Android SDK 2.1-update1 platform or higher
 # This library is made based on NyARToolkit for Java v3.0.0 of nyatla.
 # This library is done to the part where the marker position
   in 3D space is calculated recognizing the marker from the input image.
 # You should make the camera part that depends on hardware according to the model.
 # You can draw 3D graphics by your own.
 # The sample of the display that uses min3d is included.

----------------------------------------------------------------------
 NyARToolKit for Android License
----------------------------------------------------------------------
NyARToolKit for Androidは「GPL」と「Commercialライセンス」の
デュアルライセンス方式を採用しています。
また、NyARToolKit for Androidは関連するいくつかのライブラリも含めて配布しています。
含まれるライブラリは、それぞれのライセンスが適応されます。

[GPL License]
ライセンスの内容は、COPYING.txtをご確認ください
また、GPL(the GNU General Public License v3)を選択した場合、
商用・非商用を問わず、無料で使用可能です。
ただし、GPLで課されている条件に従い、GPLを適応していることの告知、
並びにユーザーの要求に応じてアプリケーションのソースコードの提供、
これらを含む義務を履行してください。

[Commercial License]
NyARToolKit for AndroidはGPLを受け入れることができないユーザーのために、
Commercial Licenseが有償でARToolworks Inc.より提供されています。
ARToolworks Inc.より許諾を受けることにより、GPLの制約から解放されます。
条件やライセンス費用については、ARToolworks Inc.に問合せてください。

ARToolworks Inc. http://www.artoolworks.com/
mailto : sales@artoolworks.com


NyARToolKit for Android is available for download and use under two licenses:

GPL License: NyARToolKit for Android can be used for free under GPL v3
(the GNU General Public License, v3). Source code of applications using
NyARToolKit for Android under the GPL must be provided free of charge on request.

Commercial License: Source code of NyARToolKit for Android applications
can be protected with a commercial license, offered exclusively by ARToolworks.
Applications using the commercial license do not have to provide
source code, but must pay a licensing fee.
Contact ARToolworks at sales@artoolworks.com for more information.

ARToolworks Inc.
http://www.artoolworks.com/

Moreover, NyARToolKit for Android is distributed including
some relating libraries. Each license adjusts to the included library.

----------------------------------------------------------------------
 External library
----------------------------------------------------------------------
[Android SDK]
 URL     : http://developer.android.com/
 License : Apache Software License, 2.0

----------------------------------------------------------------------
 Development environment
----------------------------------------------------------------------
 * Android 2.1 Platform + Eclipse Galileo + JDK 6
 
----------------------------------------------------------------------
 Special thanks
----------------------------------------------------------------------
加藤博一先生 (Hirokazu Kato, Ph. D.)
 http://www.hitl.washington.edu/artoolkit/

Prof. Mark Billinghurst
 http://www.hitlabnz.org/

----------------------------------------------------------------------
 Change Log
----------------------------------------------------------------------
3.0.0-1 (2011-May-6)
 * Fixed Readme
 * パッケージ内容の変更
 * rpfライブラリを削除
3.0.0 (2011-Apr-15)
 * The first release
