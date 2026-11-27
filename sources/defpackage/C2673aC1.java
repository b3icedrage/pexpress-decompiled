package defpackage;

import android.graphics.Matrix;
import android.util.Xml;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.onesignal.core.activities.PermissionsActivity;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: aC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2673aC1 {
    public XB1 a;
    public XB1.I b;
    public boolean c;
    public int d;
    public boolean e;
    public g f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX INFO: renamed from: aC1$a */
    public static class a {
        public static final HashMap a;

        static {
            HashMap map = new HashMap(10);
            a = map;
            map.put(DevicePublicKeyStringDef.NONE, C3835fh1.a.d);
            map.put("xMinYMin", C3835fh1.a.e);
            map.put("xMidYMin", C3835fh1.a.g);
            map.put("xMaxYMin", C3835fh1.a.h);
            map.put("xMinYMid", C3835fh1.a.i);
            map.put("xMidYMid", C3835fh1.a.j);
            map.put("xMaxYMid", C3835fh1.a.k);
            map.put("xMinYMax", C3835fh1.a.l);
            map.put("xMidYMax", C3835fh1.a.m);
            map.put("xMaxYMax", C3835fh1.a.n);
        }
    }

    /* JADX INFO: renamed from: aC1$b */
    public static class b {
        public static final HashMap a;

        static {
            HashMap map = new HashMap(47);
            a = map;
            Z0.e(-984833, map, "aliceblue", -332841, "antiquewhite");
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            Z0.e(-983041, map, "azure", -657956, "beige");
            Z0.e(-6972, map, "bisque", -16777216, "black");
            Z0.e(-5171, map, "blanchedalmond", -16776961, "blue");
            Z0.e(-7722014, map, "blueviolet", -5952982, "brown");
            Z0.e(-2180985, map, "burlywood", -10510688, "cadetblue");
            Z0.e(-8388864, map, "chartreuse", -2987746, "chocolate");
            Z0.e(-32944, map, "coral", -10185235, "cornflowerblue");
            Z0.e(-1828, map, "cornsilk", -2354116, "crimson");
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            Z0.e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            Z0.e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            Z0.e(-29696, map, "darkorange", -6737204, "darkorchid");
            Z0.e(-7667712, map, "darkred", -1468806, "darksalmon");
            Z0.e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            Z0.e(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            Z0.e(-1296, map, "floralwhite", -14513374, "forestgreen");
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            Z0.e(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            Z0.e(-16744448, map, "green", -5374161, "greenyellow");
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            Z0.e(-38476, map, "hotpink", -3318692, "indianred");
            Z0.e(-11861886, map, "indigo", -16, "ivory");
            Z0.e(-989556, map, "khaki", -1644806, "lavender");
            Z0.e(-3851, map, "lavenderblush", -8586240, "lawngreen");
            Z0.e(-1331, map, "lemonchiffon", -5383962, "lightblue");
            Z0.e(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            Z0.e(-18751, map, "lightpink", -24454, "lightsalmon");
            Z0.e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            Z0.e(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            Z0.e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            Z0.e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            Z0.e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            Z0.e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            Z0.e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            Z0.e(-15132304, map, "midnightblue", -655366, "mintcream");
            Z0.e(-6943, map, "mistyrose", -6987, "moccasin");
            Z0.e(-8531, map, "navajowhite", -16777088, "navy");
            Z0.e(-133658, map, "oldlace", -8355840, "olive");
            Z0.e(-9728477, map, "olivedrab", -23296, "orange");
            Z0.e(-47872, map, "orangered", -2461482, "orchid");
            Z0.e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            Z0.e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            Z0.e(-4139, map, "papayawhip", -9543, "peachpuff");
            Z0.e(-3308225, map, "peru", -16181, "pink");
            Z0.e(-2252579, map, "plum", -5185306, "powderblue");
            Z0.e(-8388480, map, "purple", -10079335, "rebeccapurple");
            Z0.e(-65536, map, "red", -4419697, "rosybrown");
            Z0.e(-12490271, map, "royalblue", -7650029, "saddlebrown");
            Z0.e(-360334, map, "salmon", -744352, "sandybrown");
            Z0.e(-13726889, map, "seagreen", -2578, "seashell");
            Z0.e(-6270419, map, "sienna", -4144960, "silver");
            Z0.e(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            Z0.e(-12156236, map, "steelblue", -2968436, "tan");
            Z0.e(-16744320, map, "teal", -2572328, "thistle");
            Z0.e(-40121, map, "tomato", -12525360, "turquoise");
            Z0.e(-1146130, map, "violet", -663885, "wheat");
            Z0.e(-1, map, "white", -657931, "whitesmoke");
            Z0.e(-256, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    /* JADX INFO: renamed from: aC1$c */
    public static class c {
        public static final HashMap a;

        static {
            HashMap map = new HashMap(9);
            a = map;
            XB1.c0 c0Var = XB1.c0.e;
            map.put("xx-small", new XB1.C2378o(0.694f, c0Var));
            map.put("x-small", new XB1.C2378o(0.833f, c0Var));
            map.put("small", new XB1.C2378o(10.0f, c0Var));
            map.put("medium", new XB1.C2378o(12.0f, c0Var));
            map.put("large", new XB1.C2378o(14.4f, c0Var));
            map.put("x-large", new XB1.C2378o(17.3f, c0Var));
            map.put("xx-large", new XB1.C2378o(20.7f, c0Var));
            XB1.c0 c0Var2 = XB1.c0.g;
            map.put("smaller", new XB1.C2378o(83.33f, c0Var2));
            map.put("larger", new XB1.C2378o(120.0f, c0Var2));
        }
    }

    /* JADX INFO: renamed from: aC1$d */
    public static class d {
        public static final HashMap a;

        static {
            HashMap map = new HashMap(13);
            a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            Z0.e(1, map, "bolder", -1, "lighter");
            Z0.e(100, map, "100", HttpPlatformResponse.MAX_MESSAGE_LENGTH, "200");
            map.put("300", 300);
            map.put("400", 400);
            Z0.e(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, map, "500", 600, "600");
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }
    }

    /* JADX INFO: renamed from: aC1$e */
    public class e extends DefaultHandler2 {
        public e() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i2) {
            C2673aC1.this.F(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() {
            C2673aC1.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) {
            C2673aC1.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) {
            h hVar = new h(str2);
            C2673aC1.this.getClass();
            C2673aC1.y(hVar);
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() {
            C2673aC1 c2673aC1 = C2673aC1.this;
            c2673aC1.getClass();
            c2673aC1.a = new XB1();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws ZB1 {
            C2673aC1.this.E(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: aC1$f */
    public static final class f {
        public static final f d = new f("CLASS", 0);
        public static final f e = new f("clip", 1);
        public static final f g = new f("clip_path", 2);
        public static final f h = new f("clipPathUnits", 3);
        public static final f i = new f("clip_rule", 4);
        public static final f j = new f("color", 5);
        public static final f k = new f("cx", 6);
        public static final f l = new f("cy", 7);
        public static final f m = new f("direction", 8);
        public static final f n = new f("dx", 9);
        public static final f o = new f("dy", 10);
        public static final f p = new f("fx", 11);
        public static final f q = new f("fy", 12);
        public static final f r = new f("d", 13);
        public static final f s = new f("display", 14);
        public static final f t = new f("fill", 15);
        public static final f u = new f("fill_rule", 16);
        public static final f v = new f("fill_opacity", 17);
        public static final f w = new f("font", 18);
        public static final f x = new f("font_family", 19);
        public static final f y = new f("font_size", 20);
        public static final f z = new f("font_weight", 21);
        public static final f A = new f("font_style", 22);
        public static final f B = new f("gradientTransform", 23);
        public static final f C = new f("gradientUnits", 24);
        public static final f D = new f("height", 25);
        public static final f E = new f("href", 26);
        public static final f F = new f("image_rendering", 27);
        public static final f G = new f("marker", 28);
        public static final f H = new f("marker_start", 29);
        public static final f I = new f("marker_mid", 30);
        public static final f J = new f("marker_end", 31);
        public static final f K = new f("markerHeight", 32);
        public static final f L = new f("markerUnits", 33);
        public static final f M = new f("markerWidth", 34);
        public static final f N = new f("mask", 35);
        public static final f O = new f("maskContentUnits", 36);
        public static final f P = new f("maskUnits", 37);
        public static final f Q = new f("media", 38);
        public static final f R = new f("offset", 39);
        public static final f S = new f("opacity", 40);
        public static final f T = new f("orient", 41);
        public static final f U = new f("overflow", 42);
        public static final f V = new f("pathLength", 43);
        public static final f W = new f("patternContentUnits", 44);
        public static final f X = new f("patternTransform", 45);
        public static final f Y = new f("patternUnits", 46);
        public static final f Z = new f("points", 47);
        public static final f a0 = new f("preserveAspectRatio", 48);
        public static final f b0 = new f("r", 49);
        public static final f c0 = new f("refX", 50);
        public static final f d0 = new f("refY", 51);
        public static final f e0 = new f("requiredFeatures", 52);
        public static final f f0 = new f("requiredExtensions", 53);
        public static final f g0 = new f("requiredFormats", 54);
        public static final f h0 = new f("requiredFonts", 55);
        public static final f i0 = new f("rx", 56);
        public static final f j0 = new f("ry", 57);
        public static final f k0 = new f("solid_color", 58);
        public static final f l0 = new f("solid_opacity", 59);
        public static final f m0 = new f("spreadMethod", 60);
        public static final f n0 = new f("startOffset", 61);
        public static final f o0 = new f("stop_color", 62);
        public static final f p0 = new f("stop_opacity", 63);
        public static final f q0 = new f("stroke", 64);
        public static final f r0 = new f("stroke_dasharray", 65);
        public static final f s0 = new f("stroke_dashoffset", 66);
        public static final f t0 = new f("stroke_linecap", 67);
        public static final f u0 = new f("stroke_linejoin", 68);
        public static final f v0 = new f("stroke_miterlimit", 69);
        public static final f w0 = new f("stroke_opacity", 70);
        public static final f x0 = new f("stroke_width", 71);
        public static final f y0 = new f("style", 72);
        public static final f z0 = new f("systemLanguage", 73);
        public static final f A0 = new f("text_anchor", 74);
        public static final f B0 = new f("text_decoration", 75);
        public static final f C0 = new f("transform", 76);
        public static final f D0 = new f("type", 77);
        public static final f E0 = new f("vector_effect", 78);
        public static final f F0 = new f("version", 79);
        public static final f G0 = new f("viewBox", 80);
        public static final f H0 = new f("width", 81);
        public static final f I0 = new f("x", 82);
        public static final f J0 = new f("y", 83);
        public static final f K0 = new f("x1", 84);
        public static final f L0 = new f("y1", 85);
        public static final f M0 = new f("x2", 86);
        public static final f N0 = new f("y2", 87);
        public static final f O0 = new f("viewport_fill", 88);
        public static final f P0 = new f("viewport_fill_opacity", 89);
        public static final f Q0 = new f("visibility", 90);
        public static final f R0 = new f("UNSUPPORTED", 91);
        public static final /* synthetic */ f[] T0 = {d, e, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0};
        public static final HashMap S0 = new HashMap();

        static {
            for (f fVar : values()) {
                if (fVar == d) {
                    S0.put("class", fVar);
                } else if (fVar != R0) {
                    S0.put(fVar.name().replace('_', '-'), fVar);
                }
            }
        }

        public f() {
            throw null;
        }

        public static f b(String str) {
            f fVar = (f) S0.get(str);
            return fVar != null ? fVar : R0;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) T0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: aC1$g */
    public static final class g {
        public static final g d;
        public static final g e;
        public static final g g;
        public static final g h;
        public static final HashMap i;
        public static final /* synthetic */ g[] j;

        /* JADX INFO: Fake field, exist only in values array */
        g EF1;

        static {
            g gVar = new g("svg", 0);
            g gVar2 = new g(R51.PUSH_ADDITIONAL_DATA_KEY, 1);
            g gVar3 = new g("circle", 2);
            g gVar4 = new g("clipPath", 3);
            g gVar5 = new g("defs", 4);
            g gVar6 = new g("desc", 5);
            d = gVar6;
            g gVar7 = new g("ellipse", 6);
            g gVar8 = new g("g", 7);
            g gVar9 = new g("image", 8);
            g gVar10 = new g("line", 9);
            g gVar11 = new g("linearGradient", 10);
            g gVar12 = new g("marker", 11);
            g gVar13 = new g("mask", 12);
            g gVar14 = new g("path", 13);
            g gVar15 = new g("pattern", 14);
            g gVar16 = new g("polygon", 15);
            g gVar17 = new g("polyline", 16);
            g gVar18 = new g("radialGradient", 17);
            g gVar19 = new g("rect", 18);
            g gVar20 = new g("solidColor", 19);
            g gVar21 = new g("stop", 20);
            g gVar22 = new g("style", 21);
            g gVar23 = new g("SWITCH", 22);
            e = gVar23;
            g gVar24 = new g("symbol", 23);
            g gVar25 = new g("text", 24);
            g gVar26 = new g("textPath", 25);
            g gVar27 = new g("title", 26);
            g = gVar27;
            g gVar28 = new g("tref", 27);
            g gVar29 = new g("tspan", 28);
            g gVar30 = new g("use", 29);
            g gVar31 = new g(Promotion.ACTION_VIEW, 30);
            g gVar32 = new g("UNSUPPORTED", 31);
            h = gVar32;
            j = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25, gVar26, gVar27, gVar28, gVar29, gVar30, gVar31, gVar32};
            i = new HashMap();
            for (g gVar33 : values()) {
                if (gVar33 == e) {
                    i.put("switch", gVar33);
                } else if (gVar33 != h) {
                    i.put(gVar33.name(), gVar33);
                }
            }
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) j.clone();
        }
    }

    /* JADX INFO: renamed from: aC1$h */
    public static class h {
        public final String a;
        public final int c;
        public int b = 0;
        public final C6917u71 d = new C6917u71();

        public h(String str) {
            this.c = 0;
            String strTrim = str.trim();
            this.a = strTrim;
            this.c = strTrim.length();
        }

        public static boolean g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        public final boolean f() {
            return this.b == this.c;
        }

        public final Integer h() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            this.b = i + 1;
            return Integer.valueOf(this.a.charAt(i));
        }

        public final float i() {
            int i = this.b;
            int i2 = this.c;
            C6917u71 c6917u71 = this.d;
            float fA = c6917u71.a(i, i2, this.a);
            if (!Float.isNaN(fA)) {
                this.b = c6917u71.a;
            }
            return fA;
        }

        public final XB1.C2378o j() {
            float fI = i();
            if (Float.isNaN(fI)) {
                return null;
            }
            XB1.c0 c0VarN = n();
            return c0VarN == null ? new XB1.C2378o(fI, XB1.c0.d) : new XB1.C2378o(fI, c0VarN);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return str.substring(i + 1, i2);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c, boolean z) {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            char cCharAt = str.charAt(i);
            if ((!z && g(cCharAt)) || cCharAt == c) {
                return null;
            }
            int i2 = this.b;
            int iA = a();
            while (iA != -1 && iA != c && (z || !g(iA))) {
                iA = a();
            }
            return str.substring(i2, this.b);
        }

        public final XB1.c0 n() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            if (str.charAt(i) == '%') {
                this.b++;
                return XB1.c0.g;
            }
            int i2 = this.b;
            if (i2 > this.c - 2) {
                return null;
            }
            try {
                XB1.c0 c0VarValueOf = XB1.c0.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return c0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i = this.b;
            int i2 = this.c;
            C6917u71 c6917u71 = this.d;
            float fA = c6917u71.a(i, i2, this.a);
            if (!Float.isNaN(fA)) {
                this.b = c6917u71.a;
            }
            return fA;
        }

        public final boolean p() {
            q();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !g(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: aC1$i */
    public class i implements Attributes {
        public XmlPullParser a;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.a;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.a.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x0281  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:234:0x0394  */
    /* JADX WARN: Code duplicated, block: B:309:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:343:0x050a  */
    /* JADX WARN: Code duplicated, block: B:387:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:442:0x0673  */
    public static void D(XB1.D d2, String str, String str2) {
        XB1.C2365b c2365b;
        Boolean bool;
        XB1.D.f fVar;
        XB1.D.g gVar;
        String strM;
        XB1.C2378o c2378oS;
        String strSubstring;
        XB1.C2378o c2378oS2;
        XB1.D.b bVar;
        XB1.D.e eVar;
        XB1.C2378o c2378oJ;
        XB1.C2378o[] c2378oArr;
        XB1.D.c cVar;
        XB1.D.d dVar;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = f.b(str).ordinal();
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                h hVar = new h(str2.substring(5));
                hVar.q();
                XB1.C2378o c2378oU = u(hVar);
                hVar.p();
                XB1.C2378o c2378oU2 = u(hVar);
                hVar.p();
                XB1.C2378o c2378oU3 = u(hVar);
                hVar.p();
                XB1.C2378o c2378oU4 = u(hVar);
                hVar.q();
                if (hVar.d(')') || hVar.f()) {
                    c2365b = new XB1.C2365b();
                    c2365b.a = c2378oU;
                    c2365b.b = c2378oU2;
                    c2365b.c = c2378oU3;
                    c2365b.d = c2378oU4;
                } else {
                    c2365b = null;
                }
            } else {
                c2365b = null;
            }
            d2.A = c2365b;
            if (c2365b != null) {
                d2.d |= C2688aH1.MAX_EVENT_SIZE_BYTES;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            d2.I = r(str2);
            d2.d |= 268435456;
            return;
        }
        XB1.D.a aVar = XB1.D.a.e;
        XB1.D.a aVar2 = XB1.D.a.d;
        if (iOrdinal == 4) {
            d2.J = "nonzero".equals(str2) ? aVar2 : "evenodd".equals(str2) ? aVar : null;
            d2.d |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                d2.r = n(str2);
                d2.d |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                XB1.D.h hVar2 = str2.equals("ltr") ? XB1.D.h.d : !str2.equals("rtl") ? null : XB1.D.h.e;
                d2.x = hVar2;
                if (hVar2 != null) {
                    d2.d |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                d2.K = r(str2);
                d2.d |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                d2.q = v(str2);
                d2.d |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                d2.z = bool;
                if (bool != null) {
                    d2.d |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                XB1.D.i iVar = str2.equals(DevicePublicKeyStringDef.NONE) ? XB1.D.i.d : !str2.equals("non-scaling-stroke") ? null : XB1.D.i.e;
                d2.P = iVar;
                if (iVar != null) {
                    d2.d |= 34359738368L;
                    return;
                }
                return;
            }
            XB1.C2369f c2369f = XB1.C2369f.d;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    d2.L = c2369f;
                } else {
                    try {
                        d2.L = n(str2);
                    } catch (ZB1 e2) {
                        b0.e("SVGParser", e2.getMessage());
                        return;
                    }
                }
                d2.d |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                d2.M = v(str2);
                d2.d |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        fVar = XB1.D.f.e;
                        break;
                    case "end":
                        fVar = XB1.D.f.g;
                        break;
                    case "start":
                        fVar = XB1.D.f.d;
                        break;
                    default:
                        fVar = null;
                        break;
                }
                d2.y = fVar;
                if (fVar != null) {
                    d2.d |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        gVar = XB1.D.g.h;
                        break;
                    case "underline":
                        gVar = XB1.D.g.e;
                        break;
                    case "none":
                        gVar = XB1.D.g.d;
                        break;
                    case "blink":
                        gVar = XB1.D.g.i;
                        break;
                    case "overline":
                        gVar = XB1.D.g.g;
                        break;
                    default:
                        gVar = null;
                        break;
                }
                d2.w = gVar;
                if (gVar != null) {
                    d2.d |= 131072;
                    return;
                }
                return;
            }
            XB1.D.b bVar2 = XB1.D.b.g;
            XB1.D.b bVar3 = XB1.D.b.e;
            XB1.D.b bVar4 = XB1.D.b.d;
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            d2.E = Boolean.valueOf(!str2.equals(DevicePublicKeyStringDef.NONE));
                            d2.d |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    XB1.N nW = w(str2);
                    d2.e = nW;
                    if (nW != null) {
                        d2.d |= 1;
                    }
                    break;
                case 16:
                    XB1.D.a aVar3 = "nonzero".equals(str2) ? aVar2 : "evenodd".equals(str2) ? aVar : null;
                    d2.g = aVar3;
                    if (aVar3 != null) {
                        d2.d |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    d2.h = fV;
                    if (fV != null) {
                        d2.d |= 4;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        h hVar3 = new h(str2);
                        Integer num = null;
                        XB1.D.b bVar5 = null;
                        String str3 = null;
                        while (true) {
                            strM = hVar3.m('/', false);
                            hVar3.q();
                            if (strM == null) {
                                break;
                            } else if (num == null || bVar5 == null) {
                                if (!strM.equals("normal") && (num != null || (num = (Integer) d.a.get(strM)) == null)) {
                                    if (bVar5 == null) {
                                        switch (strM) {
                                            case "oblique":
                                                bVar5 = bVar2;
                                                break;
                                            case "italic":
                                                bVar5 = bVar3;
                                                break;
                                            case "normal":
                                                bVar5 = bVar4;
                                                break;
                                            default:
                                                bVar5 = null;
                                                break;
                                        }
                                        if (bVar5 != null) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strM.equals("small-caps")) {
                                        str3 = strM;
                                    }
                                }
                            }
                        }
                        try {
                            c2378oS = (XB1.C2378o) c.a.get(strM);
                            if (c2378oS == null) {
                                c2378oS = s(strM);
                            }
                        } catch (ZB1 unused) {
                            c2378oS = null;
                        }
                        if (hVar3.d('/')) {
                            hVar3.q();
                            String strL = hVar3.l();
                            if (strL != null) {
                                s(strL);
                            }
                            hVar3.q();
                        }
                        if (hVar3.f()) {
                            strSubstring = null;
                        } else {
                            int i2 = hVar3.b;
                            hVar3.b = hVar3.c;
                            strSubstring = hVar3.a.substring(i2);
                        }
                        d2.s = q(strSubstring);
                        d2.t = c2378oS;
                        d2.u = Integer.valueOf(num == null ? 400 : num.intValue());
                        if (bVar5 == null) {
                            bVar5 = bVar4;
                        }
                        d2.v = bVar5;
                        d2.d |= 122880;
                        break;
                    }
                    break;
                case 19:
                    ArrayList arrayListQ = q(str2);
                    d2.s = arrayListQ;
                    if (arrayListQ != null) {
                        d2.d |= 8192;
                    }
                    break;
                case 20:
                    try {
                        XB1.C2378o c2378o = (XB1.C2378o) c.a.get(str2);
                        c2378oS2 = c2378o == null ? s(str2) : c2378o;
                    } catch (ZB1 unused2) {
                        c2378oS2 = null;
                    }
                    d2.t = c2378oS2;
                    if (c2378oS2 != null) {
                        d2.d |= 16384;
                    }
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    Integer num2 = (Integer) d.a.get(str2);
                    d2.u = num2;
                    if (num2 != null) {
                        d2.d |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            bVar = bVar2;
                            break;
                        case "italic":
                            bVar = bVar3;
                            break;
                        case "normal":
                            bVar = bVar4;
                            break;
                        default:
                            bVar = null;
                            break;
                    }
                    d2.v = bVar;
                    if (bVar != null) {
                        d2.d |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    eVar = XB1.D.e.e;
                                    break;
                                case "auto":
                                    eVar = XB1.D.e.d;
                                    break;
                                case "optimizeSpeed":
                                    eVar = XB1.D.e.g;
                                    break;
                                default:
                                    eVar = null;
                                    break;
                            }
                            d2.Q = eVar;
                            if (eVar != null) {
                                d2.d |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strR = r(str2);
                            d2.B = strR;
                            d2.C = strR;
                            d2.D = strR;
                            d2.d |= 14680064;
                            break;
                        case 29:
                            d2.B = r(str2);
                            d2.d |= 2097152;
                            break;
                        case 30:
                            d2.C = r(str2);
                            d2.d |= 4194304;
                            break;
                        case 31:
                            d2.D = r(str2);
                            d2.d |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        d2.G = c2369f;
                                    } else {
                                        try {
                                            d2.G = n(str2);
                                        } catch (ZB1 e3) {
                                            b0.e("SVGParser", e3.getMessage());
                                            return;
                                        }
                                    }
                                    d2.d |= 67108864;
                                    break;
                                case 63:
                                    d2.H = v(str2);
                                    d2.d |= 134217728;
                                    break;
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    XB1.N nW2 = w(str2);
                                    d2.i = nW2;
                                    if (nW2 != null) {
                                        d2.d |= 8;
                                    }
                                    break;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    if (!DevicePublicKeyStringDef.NONE.equals(str2)) {
                                        h hVar4 = new h(str2);
                                        hVar4.q();
                                        if (hVar4.f() || (c2378oJ = hVar4.j()) == null || c2378oJ.h()) {
                                            c2378oArr = null;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(c2378oJ);
                                            float f2 = c2378oJ.d;
                                            while (true) {
                                                if (!hVar4.f()) {
                                                    hVar4.p();
                                                    XB1.C2378o c2378oJ2 = hVar4.j();
                                                    if (c2378oJ2 != null && !c2378oJ2.h()) {
                                                        arrayList.add(c2378oJ2);
                                                        f2 += c2378oJ2.d;
                                                    }
                                                } else if (f2 != 0.0f) {
                                                    c2378oArr = (XB1.C2378o[]) arrayList.toArray(new XB1.C2378o[arrayList.size()]);
                                                }
                                                c2378oArr = null;
                                            }
                                        }
                                        d2.o = c2378oArr;
                                        if (c2378oArr != null) {
                                            d2.d |= 512;
                                        }
                                    } else {
                                        d2.o = null;
                                        d2.d |= 512;
                                    }
                                    break;
                                case 66:
                                    d2.p = s(str2);
                                    d2.d |= 1024;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        cVar = XB1.D.c.d;
                                    } else if ("round".equals(str2)) {
                                        cVar = XB1.D.c.e;
                                    } else {
                                        cVar = "square".equals(str2) ? XB1.D.c.g : null;
                                    }
                                    d2.l = cVar;
                                    if (cVar != null) {
                                        d2.d |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        dVar = XB1.D.d.d;
                                    } else if ("round".equals(str2)) {
                                        dVar = XB1.D.d.e;
                                    } else {
                                        dVar = "bevel".equals(str2) ? XB1.D.d.g : null;
                                    }
                                    d2.m = dVar;
                                    if (dVar != null) {
                                        d2.d |= 128;
                                    }
                                    break;
                                case 69:
                                    d2.n = Float.valueOf(p(str2));
                                    d2.d |= 256;
                                    break;
                                case 70:
                                    Float fV2 = v(str2);
                                    d2.j = fV2;
                                    if (fV2 != null) {
                                        d2.d |= 16;
                                    }
                                    break;
                                case 71:
                                    d2.k = s(str2);
                                    d2.d |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                d2.N = c2369f;
                                            } else {
                                                try {
                                                    d2.N = n(str2);
                                                } catch (ZB1 e4) {
                                                    b0.e("SVGParser", e4.getMessage());
                                                    return;
                                                }
                                            }
                                            d2.d |= 8589934592L;
                                            break;
                                        case 89:
                                            d2.O = v(str2);
                                            d2.d |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    d2.F = Boolean.valueOf(str2.equals("visible"));
                                                    d2.d |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (ZB1 unused3) {
        }
    }

    public static int b(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    public static int d(float f2, float f3, float f4) {
        float f5 = 0.0f;
        float f6 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f6 += 360.0f;
        }
        float f7 = f6 / 60.0f;
        float f8 = f3 / 100.0f;
        float f9 = f4 / 100.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f9 >= 0.0f) {
            f5 = f9 > 1.0f ? 1.0f : f9;
        }
        float f10 = f5 <= 0.5f ? (f8 + 1.0f) * f5 : (f5 + f8) - (f8 * f5);
        float f11 = (f5 * 2.0f) - f10;
        return b(e(f11, f10, f7 - 2.0f) * 256.0f) | (b(e(f11, f10, f7 + 2.0f) * 256.0f) << 16) | (b(e(f11, f10, f7) * 256.0f) << 8);
    }

    public static float e(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            return BX.a(f3, f2, f4, f2);
        }
        if (f4 < 3.0f) {
            return f3;
        }
        return f4 < 4.0f ? BX.a(4.0f, f4, f3 - f2, f2) : f2;
    }

    public static void f(XB1.F f2, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iB = C6133qP.b(attributes, i2);
            if (iB != 73) {
                switch (iB) {
                    case 52:
                        h hVar = new h(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!hVar.f()) {
                            String strL = hVar.l();
                            if (strL.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strL.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            hVar.q();
                        }
                        f2.e(hashSet);
                        break;
                    case 53:
                        f2.h(strTrim);
                        break;
                    case 54:
                        h hVar2 = new h(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!hVar2.f()) {
                            hashSet2.add(hVar2.l());
                            hVar2.q();
                        }
                        f2.i(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        f2.g(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                h hVar3 = new h(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!hVar3.f()) {
                    String strL2 = hVar3.l();
                    int iIndexOf = strL2.indexOf(45);
                    if (iIndexOf != -1) {
                        strL2 = strL2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strL2, "", "").getLanguage());
                    hVar3.q();
                }
                f2.j(hashSet3);
            }
        }
    }

    public static void g(XB1.K k, Attributes attributes) throws ZB1 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                k.c = attributes.getValue(i2).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i2).trim();
                if ("default".equals(strTrim)) {
                    k.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new ZB1(C5491nL.c("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    k.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(XB1.AbstractC2372i abstractC2372i, Attributes attributes) throws ZB1 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iB = C6133qP.b(attributes, i2);
            if (iB == 23) {
                abstractC2372i.j = z(strTrim);
            } else if (iB != 24) {
                if (iB != 26) {
                    if (iB != 60) {
                        continue;
                    } else {
                        try {
                            abstractC2372i.k = XB1.EnumC2373j.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new ZB1(C1039Gc0.d("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    abstractC2372i.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC2372i.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new ZB1("Invalid value for attribute gradientUnits");
                }
                abstractC2372i.i = Boolean.TRUE;
            }
        }
    }

    public static void i(XB1.C2388y c2388y, Attributes attributes, String str) throws ZB1 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (f.b(attributes.getLocalName(i2)) == f.Z) {
                h hVar = new h(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                hVar.q();
                while (!hVar.f()) {
                    float fI = hVar.i();
                    if (Float.isNaN(fI)) {
                        throw new ZB1(C1039Gc0.d("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    hVar.p();
                    float fI2 = hVar.i();
                    if (Float.isNaN(fI2)) {
                        throw new ZB1(C1039Gc0.d("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    hVar.p();
                    arrayList.add(Float.valueOf(fI));
                    arrayList.add(Float.valueOf(fI2));
                }
                c2388y.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    c2388y.o[i3] = ((Float) it.next()).floatValue();
                    i3++;
                }
            }
        }
    }

    public static void j(XB1.K k, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (strTrim.length() != 0) {
                int iB = C6133qP.b(attributes, i2);
                if (iB == 0) {
                    C3467dx.c cVar = new C3467dx.c(strTrim);
                    ArrayList arrayList = null;
                    while (!cVar.f()) {
                        String strL = cVar.l();
                        if (strL != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strL);
                            cVar.q();
                        }
                    }
                    k.g = arrayList;
                } else if (iB != 72) {
                    if (k.e == null) {
                        k.e = new XB1.D();
                    }
                    D(k.e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    h hVar = new h(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM = hVar.m(':', false);
                        hVar.q();
                        if (!hVar.d(':')) {
                            break;
                        }
                        hVar.q();
                        String strM2 = hVar.m(';', true);
                        if (strM2 == null) {
                            break;
                        }
                        hVar.q();
                        if (hVar.f() || hVar.d(';')) {
                            if (k.f == null) {
                                k.f = new XB1.D();
                            }
                            D(k.f, strM, strM2);
                            hVar.q();
                        }
                    }
                }
            }
        }
    }

    public static void k(XB1.Z z, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iB = C6133qP.b(attributes, i2);
            if (iB == 9) {
                z.p = t(strTrim);
            } else if (iB == 10) {
                z.q = t(strTrim);
            } else if (iB == 82) {
                z.n = t(strTrim);
            } else if (iB == 83) {
                z.o = t(strTrim);
            }
        }
    }

    public static void l(XB1.InterfaceC2376m interfaceC2376m, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (f.b(attributes.getLocalName(i2)) == f.C0) {
                interfaceC2376m.k(z(attributes.getValue(i2)));
            }
        }
    }

    public static void m(XB1.Q q, Attributes attributes) throws ZB1 {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iB = C6133qP.b(attributes, i2);
            if (iB == 48) {
                x(q, strTrim);
            } else if (iB != 80) {
                continue;
            } else {
                h hVar = new h(strTrim);
                hVar.q();
                float fI = hVar.i();
                hVar.p();
                float fI2 = hVar.i();
                hVar.p();
                float fI3 = hVar.i();
                hVar.p();
                float fI4 = hVar.i();
                if (Float.isNaN(fI) || Float.isNaN(fI2) || Float.isNaN(fI3) || Float.isNaN(fI4)) {
                    throw new ZB1("Invalid viewBox definition - should have four numbers");
                }
                if (fI3 < 0.0f) {
                    throw new ZB1("Invalid viewBox. width cannot be negative");
                }
                if (fI4 < 0.0f) {
                    throw new ZB1("Invalid viewBox. height cannot be negative");
                }
                q.o = new XB1.C2364a(fI, fI2, fI3, fI4);
            }
        }
    }

    public static XB1.C2368e n(String str) throws ZB1 {
        long j;
        int i2;
        if (str.charAt(0) == '#') {
            int length = str.length();
            LB0 lb0 = null;
            if (1 < length) {
                long j2 = 0;
                int i3 = 1;
                while (true) {
                    if (i3 < length) {
                        char cCharAt = str.charAt(i3);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i2 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i2 = cCharAt - 'a';
                            }
                            j2 = j + ((long) i2) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i3++;
                        }
                    }
                    if (i3 != 1) {
                        lb0 = new LB0(i3, j2);
                    }
                }
            }
            if (lb0 == null) {
                throw new ZB1("Bad hex colour value: ".concat(str));
            }
            long j3 = lb0.b;
            int i4 = lb0.a;
            if (i4 == 4) {
                int i5 = (int) j3;
                int i6 = i5 & 3840;
                int i7 = i5 & 240;
                int i8 = i5 & 15;
                return new XB1.C2368e(i8 | (i6 << 8) | (-16777216) | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
            }
            if (i4 != 5) {
                if (i4 == 7) {
                    return new XB1.C2368e(((int) j3) | (-16777216));
                }
                if (i4 != 9) {
                    throw new ZB1("Bad hex colour value: ".concat(str));
                }
                int i9 = (int) j3;
                return new XB1.C2368e((i9 >>> 8) | (i9 << 24));
            }
            int i10 = (int) j3;
            int i11 = 61440 & i10;
            int i12 = i10 & 3840;
            int i13 = i10 & 240;
            int i14 = i10 & 15;
            return new XB1.C2368e((i14 << 24) | (i14 << 28) | (i11 << 8) | (i11 << 4) | (i12 << 4) | i12 | i13 | (i13 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            h hVar = new h(str.substring(zStartsWith ? 5 : 4));
            hVar.q();
            float fI = hVar.i();
            if (!Float.isNaN(fI) && hVar.d('%')) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fC = hVar.c(fI);
            if (!Float.isNaN(fC) && hVar.d('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fC2 = hVar.c(fC);
            if (!Float.isNaN(fC2) && hVar.d('%')) {
                fC2 = (fC2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                hVar.q();
                if (Float.isNaN(fC2) || !hVar.d(')')) {
                    throw new ZB1("Bad rgb() colour value: ".concat(str));
                }
                return new XB1.C2368e((b(fI) << 16) | (-16777216) | (b(fC) << 8) | b(fC2));
            }
            float fC3 = hVar.c(fC2);
            hVar.q();
            if (Float.isNaN(fC3) || !hVar.d(')')) {
                throw new ZB1("Bad rgba() colour value: ".concat(str));
            }
            return new XB1.C2368e((b(fC3 * 256.0f) << 24) | (b(fI) << 16) | (b(fC) << 8) | b(fC2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) b.a.get(lowerCase);
            if (num != null) {
                return new XB1.C2368e(num.intValue());
            }
            throw new ZB1("Invalid colour keyword: ".concat(lowerCase));
        }
        h hVar2 = new h(str.substring(zStartsWith2 ? 5 : 4));
        hVar2.q();
        float fI2 = hVar2.i();
        float fC4 = hVar2.c(fI2);
        if (!Float.isNaN(fC4)) {
            hVar2.d('%');
        }
        float fC5 = hVar2.c(fC4);
        if (!Float.isNaN(fC5)) {
            hVar2.d('%');
        }
        if (!zStartsWith2) {
            hVar2.q();
            if (Float.isNaN(fC5) || !hVar2.d(')')) {
                throw new ZB1("Bad hsl() colour value: ".concat(str));
            }
            return new XB1.C2368e(d(fI2, fC4, fC5) | (-16777216));
        }
        float fC6 = hVar2.c(fC5);
        hVar2.q();
        if (Float.isNaN(fC6) || !hVar2.d(')')) {
            throw new ZB1("Bad hsla() colour value: ".concat(str));
        }
        return new XB1.C2368e((b(fC6 * 256.0f) << 24) | d(fI2, fC4, fC5));
    }

    public static float o(int i2, String str) throws ZB1 {
        float fA = new C6917u71().a(0, i2, str);
        if (Float.isNaN(fA)) {
            throw new ZB1(C5491nL.c("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws ZB1 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new ZB1("Invalid float value (empty string)");
    }

    public static ArrayList q(String str) {
        h hVar = new h(str);
        ArrayList arrayList = null;
        do {
            String strK = hVar.k();
            if (strK == null) {
                strK = hVar.m(',', true);
            }
            if (strK == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strK);
            hVar.p();
        } while (!hVar.f());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals(DevicePublicKeyStringDef.NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static XB1.C2378o s(String str) throws ZB1 {
        if (str.length() == 0) {
            throw new ZB1("Invalid length value (empty string)");
        }
        int length = str.length();
        XB1.c0 c0VarValueOf = XB1.c0.d;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            c0VarValueOf = XB1.c0.g;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                c0VarValueOf = XB1.c0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new ZB1("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new XB1.C2378o(o(length, str), c0VarValueOf);
        } catch (NumberFormatException e2) {
            throw new ZB1("Invalid length value: ".concat(str), e2);
        }
    }

    public static ArrayList t(String str) throws ZB1 {
        String str2;
        if (str.length() == 0) {
            throw new ZB1("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        h hVar = new h(str);
        hVar.q();
        while (!hVar.f()) {
            float fI = hVar.i();
            if (Float.isNaN(fI)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i2 = hVar.b;
                while (true) {
                    boolean zF = hVar.f();
                    str2 = hVar.a;
                    if (zF || h.g(str2.charAt(hVar.b))) {
                        break;
                    }
                    hVar.b++;
                }
                String strSubstring = str2.substring(i2, hVar.b);
                hVar.b = i2;
                sb.append(strSubstring);
                throw new ZB1(sb.toString());
            }
            XB1.c0 c0VarN = hVar.n();
            if (c0VarN == null) {
                c0VarN = XB1.c0.d;
            }
            arrayList.add(new XB1.C2378o(fI, c0VarN));
            hVar.p();
        }
        return arrayList;
    }

    public static XB1.C2378o u(h hVar) {
        return hVar.e("auto") ? new XB1.C2378o(0.0f) : hVar.j();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f2 = 0.0f;
            if (fP < 0.0f) {
                fP = f2;
            } else {
                f2 = 1.0f;
                if (fP > 1.0f) {
                    fP = f2;
                }
            }
            return Float.valueOf(fP);
        } catch (ZB1 unused) {
            return null;
        }
    }

    public static XB1.N w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        XB1.N n = XB1.C2368e.g;
        XB1.C2369f c2369f = XB1.C2369f.d;
        XB1.N n2 = null;
        if (!zStartsWith) {
            if (str.equals(DevicePublicKeyStringDef.NONE)) {
                return n;
            }
            if (str.equals("currentColor")) {
                return c2369f;
            }
            try {
                return n(str);
            } catch (ZB1 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new XB1.C2383t(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals(DevicePublicKeyStringDef.NONE)) {
                if (strTrim2.equals("currentColor")) {
                    n = c2369f;
                } else {
                    try {
                        n = n(strTrim2);
                    } catch (ZB1 unused2) {
                        n = null;
                    }
                }
            }
            n2 = n;
        }
        return new XB1.C2383t(strTrim, n2);
    }

    public static void x(XB1.O o, String str) throws ZB1 {
        C3835fh1.b bVar;
        h hVar = new h(str);
        hVar.q();
        String strL = hVar.l();
        if ("defer".equals(strL)) {
            hVar.q();
            strL = hVar.l();
        }
        C3835fh1.a aVar = (C3835fh1.a) a.a.get(strL);
        hVar.q();
        if (hVar.f()) {
            bVar = null;
        } else {
            String strL2 = hVar.l();
            strL2.getClass();
            if (strL2.equals("meet")) {
                bVar = C3835fh1.b.d;
            } else {
                if (!strL2.equals("slice")) {
                    throw new ZB1("Invalid preserveAspectRatio definition: ".concat(str));
                }
                bVar = C3835fh1.b.e;
            }
        }
        o.n = new C3835fh1(aVar, bVar);
    }

    public static HashMap y(h hVar) {
        HashMap map = new HashMap();
        hVar.q();
        String strM = hVar.m('=', false);
        while (strM != null) {
            hVar.d('=');
            map.put(strM, hVar.k());
            hVar.q();
            strM = hVar.m('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws ZB1 {
        Matrix matrix = new Matrix();
        h hVar = new h(str);
        hVar.q();
        while (!hVar.f()) {
            String strSubstring = null;
            if (!hVar.f()) {
                int i2 = hVar.b;
                String str2 = hVar.a;
                int iCharAt = str2.charAt(i2);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = hVar.a();
                    }
                }
                int i3 = hVar.b;
                while (h.g(iCharAt)) {
                    iCharAt = hVar.a();
                }
                if (iCharAt == 40) {
                    hVar.b++;
                    strSubstring = str2.substring(i2, i3);
                } else {
                    hVar.b = i2;
                }
            }
            if (strSubstring == null) {
                throw new ZB1("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    hVar.q();
                    float fI = hVar.i();
                    hVar.p();
                    float fI2 = hVar.i();
                    hVar.p();
                    float fI3 = hVar.i();
                    hVar.p();
                    float fI4 = hVar.i();
                    hVar.p();
                    float fI5 = hVar.i();
                    hVar.p();
                    float fI6 = hVar.i();
                    hVar.q();
                    if (Float.isNaN(fI6) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fI, fI3, fI5, fI2, fI4, fI6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    hVar.q();
                    float fI7 = hVar.i();
                    float fO = hVar.o();
                    float fO2 = hVar.o();
                    hVar.q();
                    if (Float.isNaN(fI7) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fO)) {
                        matrix.preRotate(fI7);
                    } else {
                        if (Float.isNaN(fO2)) {
                            throw new ZB1("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fI7, fO, fO2);
                    }
                    break;
                    break;
                case "scale":
                    hVar.q();
                    float fI8 = hVar.i();
                    float fO3 = hVar.o();
                    hVar.q();
                    if (Float.isNaN(fI8) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fO3)) {
                        matrix.preScale(fI8, fO3);
                    } else {
                        matrix.preScale(fI8, fI8);
                    }
                    break;
                    break;
                case "skewX":
                    hVar.q();
                    float fI9 = hVar.i();
                    hVar.q();
                    if (Float.isNaN(fI9) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fI9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    hVar.q();
                    float fI10 = hVar.i();
                    hVar.q();
                    if (Float.isNaN(fI10) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fI10)));
                    break;
                    break;
                case "translate":
                    hVar.q();
                    float fI11 = hVar.i();
                    float fO4 = hVar.o();
                    hVar.q();
                    if (Float.isNaN(fI11) || !hVar.d(')')) {
                        throw new ZB1("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fO4)) {
                        matrix.preTranslate(fI11, fO4);
                    } else {
                        matrix.preTranslate(fI11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new ZB1(C1039Gc0.d("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (hVar.f()) {
                return matrix;
            }
            hVar.p();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws ZB1 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            e eVar = new e();
            xMLReader.setContentHandler(eVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", eVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new ZB1("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new ZB1("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new ZB1("SVG parse error", e4);
        }
    }

    public final void B(InputStream inputStream) throws ZB1 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                i iVar = new i();
                iVar.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.a = new XB1();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        h hVar = new h(xmlPullParserNewPullParser.getText());
                        String strL = hVar.l();
                        y(hVar);
                        strL.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.a.a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                b0.e("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, iVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e2) {
                throw new ZB1("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new ZB1("XML parser problem", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0301  */
    /* JADX WARN: Code duplicated, block: B:149:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x031f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void C(Attributes attributes) throws ZB1 {
        int iIntValue;
        float fI;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        char cCharAt;
        Attributes attributes2 = attributes;
        if (this.b == null) {
            throw new ZB1("Invalid document. Root element must be <svg>");
        }
        XB1.C2384u c2384u = new XB1.C2384u();
        c2384u.a = this.a;
        c2384u.b = this.b;
        g(c2384u, attributes2);
        j(c2384u, attributes2);
        l(c2384u, attributes2);
        f(c2384u, attributes2);
        int i3 = 0;
        int i4 = 0;
        while (i4 < attributes2.getLength()) {
            String strTrim = attributes2.getValue(i4).trim();
            int iB = C6133qP.b(attributes2, i4);
            float f6 = 0.0f;
            if (iB == 13) {
                h hVar = new h(strTrim);
                XB1.C2385v c2385v = new XB1.C2385v();
                c2385v.b = i3;
                c2385v.d = i3;
                c2385v.a = new byte[8];
                c2385v.c = new float[16];
                if (!hVar.f() && ((iIntValue = hVar.h().intValue()) == 77 || iIntValue == 109)) {
                    float f7 = 0.0f;
                    float fI2 = 0.0f;
                    float f8 = 0.0f;
                    float fC = 0.0f;
                    float f9 = 0.0f;
                    float f10 = 0.0f;
                    while (true) {
                        hVar.q();
                        float f11 = f6;
                        switch (iIntValue) {
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            case 97:
                                float fI3 = hVar.i();
                                float fC2 = hVar.c(fI3);
                                float f12 = f8;
                                float fC3 = hVar.c(fC2);
                                Boolean boolB = hVar.b(Float.valueOf(fC3));
                                Boolean boolB2 = hVar.b(boolB);
                                if (boolB2 == null) {
                                    fI = Float.NaN;
                                } else {
                                    hVar.p();
                                    fI = hVar.i();
                                }
                                float f13 = fI;
                                float fC4 = hVar.c(f13);
                                if (!Float.isNaN(fC4) && fI3 >= f11 && fC2 >= f11) {
                                    if (iIntValue == 97) {
                                        f2 = f13 + f7;
                                        fC4 += f12;
                                    } else {
                                        f2 = f13;
                                    }
                                    boolean zBooleanValue = boolB.booleanValue();
                                    boolean zBooleanValue2 = boolB2.booleanValue();
                                    float f14 = f2;
                                    float f15 = fC4;
                                    c2385v.d(fI3, fC2, fC3, zBooleanValue, zBooleanValue2, f14, f15);
                                    f7 = f14;
                                    fI2 = f7;
                                    f8 = f15;
                                    fC = f8;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c && (((cCharAt = hVar.a.charAt(i2)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 67:
                            case 99:
                                float fI4 = hVar.i();
                                float fC5 = hVar.c(fI4);
                                float fC6 = hVar.c(fC5);
                                float fC7 = hVar.c(fC6);
                                float fC8 = hVar.c(fC7);
                                float fC9 = hVar.c(fC8);
                                if (!Float.isNaN(fC9)) {
                                    if (iIntValue == 99) {
                                        fC8 += f7;
                                        fC9 += f8;
                                        fI4 += f7;
                                        fC5 += f8;
                                        fC6 += f7;
                                        fC7 += f8;
                                    }
                                    float f16 = fI4;
                                    float f17 = fC5;
                                    f3 = fC6;
                                    fC = fC7;
                                    f4 = fC9;
                                    f5 = fC8;
                                    c2385v.c(f16, f17, f3, fC, f5, f4);
                                    fI2 = f3;
                                    f7 = f5;
                                    f8 = f4;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 72:
                            case 104:
                                float fI5 = hVar.i();
                                if (!Float.isNaN(fI5)) {
                                    if (iIntValue == 104) {
                                        fI5 += f7;
                                    }
                                    f7 = fI5;
                                    c2385v.e(f7, f8);
                                    fI2 = f7;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 76:
                            case 108:
                                float fI6 = hVar.i();
                                float fC10 = hVar.c(fI6);
                                if (!Float.isNaN(fC10)) {
                                    if (iIntValue == 108) {
                                        fI6 += f7;
                                        fC10 += f8;
                                    }
                                    f7 = fI6;
                                    f8 = fC10;
                                    c2385v.e(f7, f8);
                                    fI2 = f7;
                                    fC = f8;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 77:
                            case 109:
                                float fI7 = hVar.i();
                                float fC11 = hVar.c(fI7);
                                if (!Float.isNaN(fC11)) {
                                    if (iIntValue == 109 && c2385v.b != 0) {
                                        fI7 += f7;
                                        fC11 += f8;
                                    }
                                    f7 = fI7;
                                    f8 = fC11;
                                    c2385v.b(f7, f8);
                                    fI2 = f7;
                                    f9 = fI2;
                                    fC = f8;
                                    f10 = fC;
                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 81:
                            case 113:
                                fI2 = hVar.i();
                                fC = hVar.c(fI2);
                                float fC12 = hVar.c(fC);
                                float fC13 = hVar.c(fC12);
                                if (!Float.isNaN(fC13)) {
                                    if (iIntValue == 113) {
                                        fC12 += f7;
                                        fC13 += f8;
                                        fI2 += f7;
                                        fC += f8;
                                    }
                                    f7 = fC12;
                                    f8 = fC13;
                                    c2385v.a(fI2, fC, f7, f8);
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 83:
                            case 115:
                                float f18 = (f7 * 2.0f) - fI2;
                                float f19 = (2.0f * f8) - fC;
                                float fI8 = hVar.i();
                                float fC14 = hVar.c(fI8);
                                float fC15 = hVar.c(fC14);
                                float fC16 = hVar.c(fC15);
                                if (!Float.isNaN(fC16)) {
                                    if (iIntValue == 115) {
                                        fC15 += f7;
                                        fC16 += f8;
                                        fI8 += f7;
                                        fC14 += f8;
                                    }
                                    f3 = fI8;
                                    fC = fC14;
                                    f4 = fC16;
                                    f5 = fC15;
                                    c2385v.c(f18, f19, f3, fC, f5, f4);
                                    fI2 = f3;
                                    f7 = f5;
                                    f8 = f4;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 84:
                            case 116:
                                fI2 = (f7 * 2.0f) - fI2;
                                fC = (2.0f * f8) - fC;
                                float fI9 = hVar.i();
                                float fC17 = hVar.c(fI9);
                                if (!Float.isNaN(fC17)) {
                                    if (iIntValue == 116) {
                                        fI9 += f7;
                                        fC17 += f8;
                                    }
                                    f7 = fI9;
                                    f8 = fC17;
                                    c2385v.a(fI2, fC, f7, f8);
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                            case 118:
                                float fI10 = hVar.i();
                                if (!Float.isNaN(fI10)) {
                                    if (iIntValue == 118) {
                                        fI10 += f8;
                                    }
                                    f8 = fI10;
                                    c2385v.e(f7, f8);
                                    fC = f8;
                                    hVar.p();
                                    if (hVar.f()) {
                                        i2 = hVar.b;
                                        if (i2 != hVar.c) {
                                            iIntValue = hVar.h().intValue();
                                        }
                                        f6 = f11;
                                    }
                                } else {
                                    b0.c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 90:
                            case 122:
                                c2385v.close();
                                f7 = f9;
                                fI2 = f7;
                                f8 = f10;
                                fC = f8;
                                hVar.p();
                                if (hVar.f()) {
                                    i2 = hVar.b;
                                    if (i2 != hVar.c) {
                                        iIntValue = hVar.h().intValue();
                                    }
                                    f6 = f11;
                                }
                                break;
                        }
                    }
                }
                c2384u.o = c2385v;
            } else if (iB == 43 && p(strTrim) < 0.0f) {
                throw new ZB1("Invalid <path> element. pathLength cannot be negative");
            }
            i4++;
            attributes2 = attributes;
            i3 = 0;
        }
        this.b.f(c2384u);
    }

    public final void E(String str, String str2, String str3, Attributes attributes) throws ZB1 {
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            g gVar = (g) g.i.get(str2.length() > 0 ? str2 : str3);
            if (gVar == null) {
                gVar = g.h;
            }
            switch (gVar.ordinal()) {
                case 0:
                    XB1.E e2 = new XB1.E();
                    e2.a = this.a;
                    e2.b = this.b;
                    g(e2, attributes);
                    j(e2, attributes);
                    f(e2, attributes);
                    m(e2, attributes);
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        String strTrim = attributes.getValue(i2).trim();
                        int iB = C6133qP.b(attributes, i2);
                        if (iB == 25) {
                            XB1.C2378o c2378oS = s(strTrim);
                            e2.s = c2378oS;
                            if (c2378oS.h()) {
                                throw new ZB1("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (iB != 79) {
                            switch (iB) {
                                case 81:
                                    XB1.C2378o c2378oS2 = s(strTrim);
                                    e2.r = c2378oS2;
                                    if (c2378oS2.h()) {
                                        throw new ZB1("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    e2.p = s(strTrim);
                                    break;
                                case 83:
                                    e2.q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    XB1.I i3 = this.b;
                    if (i3 == null) {
                        this.a.a = e2;
                    } else {
                        i3.f(e2);
                    }
                    this.b = e2;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2375l c2375l = new XB1.C2375l();
                    c2375l.a = this.a;
                    c2375l.b = this.b;
                    g(c2375l, attributes);
                    j(c2375l, attributes);
                    l(c2375l, attributes);
                    f(c2375l, attributes);
                    this.b.f(c2375l);
                    this.b = c2375l;
                    return;
                case 2:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2366c c2366c = new XB1.C2366c();
                    c2366c.a = this.a;
                    c2366c.b = this.b;
                    g(c2366c, attributes);
                    j(c2366c, attributes);
                    l(c2366c, attributes);
                    f(c2366c, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes.getValue(i4).trim();
                        int iB2 = C6133qP.b(attributes, i4);
                        if (iB2 == 6) {
                            c2366c.o = s(strTrim2);
                        } else if (iB2 == 7) {
                            c2366c.p = s(strTrim2);
                        } else if (iB2 != 49) {
                            continue;
                        } else {
                            XB1.C2378o c2378oS3 = s(strTrim2);
                            c2366c.q = c2378oS3;
                            if (c2378oS3.h()) {
                                throw new ZB1("Invalid <circle> element. r cannot be negative");
                            }
                        }
                    }
                    this.b.f(c2366c);
                    return;
                case 3:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2367d c2367d = new XB1.C2367d();
                    c2367d.a = this.a;
                    c2367d.b = this.b;
                    g(c2367d, attributes);
                    j(c2367d, attributes);
                    l(c2367d, attributes);
                    f(c2367d, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes.getValue(i5).trim();
                        if (C6133qP.b(attributes, i5) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                c2367d.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    throw new ZB1("Invalid value for attribute clipPathUnits");
                                }
                                c2367d.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.f(c2367d);
                    this.b = c2367d;
                    return;
                case 4:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2370g c2370g = new XB1.C2370g();
                    c2370g.a = this.a;
                    c2370g.b = this.b;
                    g(c2370g, attributes);
                    j(c2370g, attributes);
                    l(c2370g, attributes);
                    this.b.f(c2370g);
                    this.b = c2370g;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = gVar;
                    return;
                case 6:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2371h c2371h = new XB1.C2371h();
                    c2371h.a = this.a;
                    c2371h.b = this.b;
                    g(c2371h, attributes);
                    j(c2371h, attributes);
                    l(c2371h, attributes);
                    f(c2371h, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes.getValue(i6).trim();
                        int iB3 = C6133qP.b(attributes, i6);
                        if (iB3 == 6) {
                            c2371h.o = s(strTrim4);
                        } else if (iB3 == 7) {
                            c2371h.p = s(strTrim4);
                        } else if (iB3 == 56) {
                            XB1.C2378o c2378oS4 = s(strTrim4);
                            c2371h.q = c2378oS4;
                            if (c2378oS4.h()) {
                                throw new ZB1("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iB3 != 57) {
                            continue;
                        } else {
                            XB1.C2378o c2378oS5 = s(strTrim4);
                            c2371h.r = c2378oS5;
                            if (c2378oS5.h()) {
                                throw new ZB1("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.b.f(c2371h);
                    return;
                case 8:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2377n c2377n = new XB1.C2377n();
                    c2377n.a = this.a;
                    c2377n.b = this.b;
                    g(c2377n, attributes);
                    j(c2377n, attributes);
                    l(c2377n, attributes);
                    f(c2377n, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes.getValue(i7).trim();
                        int iB4 = C6133qP.b(attributes, i7);
                        if (iB4 == 25) {
                            XB1.C2378o c2378oS6 = s(strTrim5);
                            c2377n.s = c2378oS6;
                            if (c2378oS6.h()) {
                                throw new ZB1("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iB4 != 26) {
                            if (iB4 != 48) {
                                switch (iB4) {
                                    case 81:
                                        XB1.C2378o c2378oS7 = s(strTrim5);
                                        c2377n.r = c2378oS7;
                                        if (c2378oS7.h()) {
                                            throw new ZB1("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c2377n.p = s(strTrim5);
                                        break;
                                    case 83:
                                        c2377n.q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(c2377n, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i7)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i7))) {
                            c2377n.o = strTrim5;
                        }
                    }
                    this.b.f(c2377n);
                    this.b = c2377n;
                    return;
                case 9:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2379p c2379p = new XB1.C2379p();
                    c2379p.a = this.a;
                    c2379p.b = this.b;
                    g(c2379p, attributes);
                    j(c2379p, attributes);
                    l(c2379p, attributes);
                    f(c2379p, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes.getValue(i8).trim();
                        switch (C6133qP.b(attributes, i8)) {
                            case 84:
                                c2379p.o = s(strTrim6);
                                break;
                            case 85:
                                c2379p.p = s(strTrim6);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                                c2379p.q = s(strTrim6);
                                break;
                            case 87:
                                c2379p.r = s(strTrim6);
                                break;
                        }
                    }
                    this.b.f(c2379p);
                    return;
                case 10:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.L l = new XB1.L();
                    l.a = this.a;
                    l.b = this.b;
                    g(l, attributes);
                    j(l, attributes);
                    h(l, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        switch (C6133qP.b(attributes, i9)) {
                            case 84:
                                l.m = s(strTrim7);
                                break;
                            case 85:
                                l.n = s(strTrim7);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                                l.o = s(strTrim7);
                                break;
                            case 87:
                                l.p = s(strTrim7);
                                break;
                        }
                    }
                    this.b.f(l);
                    this.b = l;
                    return;
                case 11:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2380q c2380q = new XB1.C2380q();
                    c2380q.a = this.a;
                    c2380q.b = this.b;
                    g(c2380q, attributes);
                    j(c2380q, attributes);
                    f(c2380q, attributes);
                    m(c2380q, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim8 = attributes.getValue(i10).trim();
                        int iB5 = C6133qP.b(attributes, i10);
                        if (iB5 != 41) {
                            if (iB5 == 50) {
                                c2380q.q = s(strTrim8);
                            } else if (iB5 != 51) {
                                switch (iB5) {
                                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                                        XB1.C2378o c2378oS8 = s(strTrim8);
                                        c2380q.t = c2378oS8;
                                        if (c2378oS8.h()) {
                                            throw new ZB1("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        continue;
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim8)) {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                throw new ZB1("Invalid value for attribute markerUnits");
                                            }
                                            c2380q.p = true;
                                        } else {
                                            c2380q.p = false;
                                            continue;
                                        }
                                        break;
                                    case 34:
                                        XB1.C2378o c2378oS9 = s(strTrim8);
                                        c2380q.s = c2378oS9;
                                        if (c2378oS9.h()) {
                                            throw new ZB1("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c2380q.r = s(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            c2380q.u = Float.valueOf(Float.NaN);
                        } else {
                            c2380q.u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.b.f(c2380q);
                    this.b = c2380q;
                    return;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2381r c2381r = new XB1.C2381r();
                    c2381r.a = this.a;
                    c2381r.b = this.b;
                    g(c2381r, attributes);
                    j(c2381r, attributes);
                    f(c2381r, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes.getValue(i11).trim();
                        int iB6 = C6133qP.b(attributes, i11);
                        if (iB6 == 25) {
                            XB1.C2378o c2378oS10 = s(strTrim9);
                            c2381r.q = c2378oS10;
                            if (c2378oS10.h()) {
                                throw new ZB1("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iB6 != 36) {
                            if (iB6 != 37) {
                                switch (iB6) {
                                    case 81:
                                        XB1.C2378o c2378oS11 = s(strTrim9);
                                        c2381r.p = c2378oS11;
                                        if (c2378oS11.h()) {
                                            throw new ZB1("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                c2381r.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    throw new ZB1("Invalid value for attribute maskUnits");
                                }
                                c2381r.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            c2381r.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                throw new ZB1("Invalid value for attribute maskContentUnits");
                            }
                            c2381r.o = Boolean.TRUE;
                        }
                    }
                    this.b.f(c2381r);
                    this.b = c2381r;
                    return;
                case 13:
                    C(attributes);
                    return;
                case 14:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2387x c2387x = new XB1.C2387x();
                    c2387x.a = this.a;
                    c2387x.b = this.b;
                    g(c2387x, attributes);
                    j(c2387x, attributes);
                    f(c2387x, attributes);
                    m(c2387x, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim10 = attributes.getValue(i12).trim();
                        int iB7 = C6133qP.b(attributes, i12);
                        if (iB7 == 25) {
                            XB1.C2378o c2378oS12 = s(strTrim10);
                            c2387x.v = c2378oS12;
                            if (c2378oS12.h()) {
                                throw new ZB1("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iB7 != 26) {
                            switch (iB7) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new ZB1("Invalid value for attribute patternContentUnits");
                                        }
                                        c2387x.q = Boolean.TRUE;
                                    } else {
                                        c2387x.q = Boolean.FALSE;
                                    }
                                    break;
                                case 45:
                                    c2387x.r = z(strTrim10);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new ZB1("Invalid value for attribute patternUnits");
                                        }
                                        c2387x.p = Boolean.TRUE;
                                    } else {
                                        c2387x.p = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iB7) {
                                        case 81:
                                            XB1.C2378o c2378oS13 = s(strTrim10);
                                            c2387x.u = c2378oS13;
                                            if (c2378oS13.h()) {
                                                throw new ZB1("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c2387x.s = s(strTrim10);
                                            break;
                                        case 83:
                                            c2387x.t = s(strTrim10);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i12)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i12))) {
                            c2387x.w = strTrim10;
                        }
                    }
                    this.b.f(c2387x);
                    this.b = c2387x;
                    return;
                case 15:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2389z c2389z = new XB1.C2389z();
                    c2389z.a = this.a;
                    c2389z.b = this.b;
                    g(c2389z, attributes);
                    j(c2389z, attributes);
                    l(c2389z, attributes);
                    f(c2389z, attributes);
                    i(c2389z, attributes, "polygon");
                    this.b.f(c2389z);
                    return;
                case 16:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.C2388y c2388y = new XB1.C2388y();
                    c2388y.a = this.a;
                    c2388y.b = this.b;
                    g(c2388y, attributes);
                    j(c2388y, attributes);
                    l(c2388y, attributes);
                    f(c2388y, attributes);
                    i(c2388y, attributes, "polyline");
                    this.b.f(c2388y);
                    return;
                case 17:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.P p = new XB1.P();
                    p.a = this.a;
                    p.b = this.b;
                    g(p, attributes);
                    j(p, attributes);
                    h(p, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes.getValue(i13).trim();
                        int iB8 = C6133qP.b(attributes, i13);
                        if (iB8 == 6) {
                            p.m = s(strTrim11);
                        } else if (iB8 == 7) {
                            p.n = s(strTrim11);
                        } else if (iB8 == 11) {
                            p.p = s(strTrim11);
                        } else if (iB8 == 12) {
                            p.q = s(strTrim11);
                        } else if (iB8 != 49) {
                            continue;
                        } else {
                            XB1.C2378o c2378oS14 = s(strTrim11);
                            p.o = c2378oS14;
                            if (c2378oS14.h()) {
                                throw new ZB1("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.b.f(p);
                    this.b = p;
                    return;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.A a2 = new XB1.A();
                    a2.a = this.a;
                    a2.b = this.b;
                    g(a2, attributes);
                    j(a2, attributes);
                    l(a2, attributes);
                    f(a2, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes.getValue(i14).trim();
                        int iB9 = C6133qP.b(attributes, i14);
                        if (iB9 == 25) {
                            XB1.C2378o c2378oS15 = s(strTrim12);
                            a2.r = c2378oS15;
                            if (c2378oS15.h()) {
                                throw new ZB1("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iB9 == 56) {
                            XB1.C2378o c2378oS16 = s(strTrim12);
                            a2.s = c2378oS16;
                            if (c2378oS16.h()) {
                                throw new ZB1("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iB9 != 57) {
                            switch (iB9) {
                                case 81:
                                    XB1.C2378o c2378oS17 = s(strTrim12);
                                    a2.q = c2378oS17;
                                    if (c2378oS17.h()) {
                                        throw new ZB1("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    a2.o = s(strTrim12);
                                    break;
                                case 83:
                                    a2.p = s(strTrim12);
                                    break;
                            }
                        } else {
                            XB1.C2378o c2378oS18 = s(strTrim12);
                            a2.t = c2378oS18;
                            if (c2378oS18.h()) {
                                throw new ZB1("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.b.f(a2);
                    return;
                case 19:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.B b2 = new XB1.B();
                    b2.a = this.a;
                    b2.b = this.b;
                    g(b2, attributes);
                    j(b2, attributes);
                    this.b.f(b2);
                    this.b = b2;
                    return;
                case 20:
                    XB1.I i15 = this.b;
                    if (i15 == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    if (!(i15 instanceof XB1.AbstractC2372i)) {
                        throw new ZB1("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    XB1.C c2 = new XB1.C();
                    c2.a = this.a;
                    c2.b = this.b;
                    g(c2, attributes);
                    j(c2, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim13 = attributes.getValue(i16).trim();
                        if (C6133qP.b(attributes, i16) == 39) {
                            if (strTrim13.length() == 0) {
                                throw new ZB1("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim13.length();
                            if (strTrim13.charAt(strTrim13.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fO = o(length, strTrim13);
                                float f2 = 100.0f;
                                if (z) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f2 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f2 = fO;
                                }
                                c2.h = Float.valueOf(f2);
                            } catch (NumberFormatException e3) {
                                throw new ZB1("Invalid offset value in <stop>: ".concat(strTrim13), e3);
                            }
                        }
                    }
                    this.b.f(c2);
                    this.b = c2;
                    return;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim14 = attributes.getValue(i17).trim();
                        int iB10 = C6133qP.b(attributes, i17);
                        if (iB10 == 38) {
                            str4 = strTrim14;
                        } else if (iB10 == 77) {
                            zEquals = strTrim14.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        C3467dx.c cVar = new C3467dx.c(str4);
                        cVar.q();
                        ArrayList<C3467dx.e> arrayListC = C3467dx.c(cVar);
                        C3467dx.e eVar = C3467dx.e.e;
                        for (C3467dx.e eVar2 : arrayListC) {
                            if (eVar2 == C3467dx.e.d || eVar2 == eVar) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.R r = new XB1.R();
                    r.a = this.a;
                    r.b = this.b;
                    g(r, attributes);
                    j(r, attributes);
                    l(r, attributes);
                    f(r, attributes);
                    this.b.f(r);
                    this.b = r;
                    return;
                case ConnectionResult.API_DISABLED /* 23 */:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.S s = new XB1.S();
                    s.a = this.a;
                    s.b = this.b;
                    g(s, attributes);
                    j(s, attributes);
                    f(s, attributes);
                    m(s, attributes);
                    this.b.f(s);
                    this.b = s;
                    return;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.V v = new XB1.V();
                    v.a = this.a;
                    v.b = this.b;
                    g(v, attributes);
                    j(v, attributes);
                    l(v, attributes);
                    f(v, attributes);
                    k(v, attributes);
                    this.b.f(v);
                    this.b = v;
                    return;
                case 25:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.Y y = new XB1.Y();
                    y.a = this.a;
                    y.b = this.b;
                    g(y, attributes);
                    j(y, attributes);
                    f(y, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim15 = attributes.getValue(i18).trim();
                        int iB11 = C6133qP.b(attributes, i18);
                        if (iB11 != 26) {
                            if (iB11 == 61) {
                                y.o = s(strTrim15);
                            }
                        } else if ("".equals(attributes.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i18))) {
                            y.n = strTrim15;
                        }
                    }
                    this.b.f(y);
                    this.b = y;
                    XB1.I i19 = y.b;
                    if (i19 instanceof XB1.a0) {
                        y.p = (XB1.a0) i19;
                        return;
                    } else {
                        y.p = ((XB1.W) i19).d();
                        return;
                    }
                case 27:
                    XB1.I i20 = this.b;
                    if (i20 == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    if (!(i20 instanceof XB1.X)) {
                        throw new ZB1("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    XB1.T t = new XB1.T();
                    t.a = this.a;
                    t.b = this.b;
                    g(t, attributes);
                    j(t, attributes);
                    f(t, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim16 = attributes.getValue(i21).trim();
                        if (C6133qP.b(attributes, i21) == 26 && ("".equals(attributes.getURI(i21)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i21)))) {
                            t.n = strTrim16;
                        }
                    }
                    this.b.f(t);
                    XB1.I i22 = t.b;
                    if (i22 instanceof XB1.a0) {
                        t.o = (XB1.a0) i22;
                        return;
                    } else {
                        t.o = ((XB1.W) i22).d();
                        return;
                    }
                case 28:
                    XB1.I i23 = this.b;
                    if (i23 == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    if (!(i23 instanceof XB1.X)) {
                        throw new ZB1("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    XB1.U u = new XB1.U();
                    u.a = this.a;
                    u.b = this.b;
                    g(u, attributes);
                    j(u, attributes);
                    f(u, attributes);
                    k(u, attributes);
                    this.b.f(u);
                    this.b = u;
                    XB1.I i24 = u.b;
                    if (i24 instanceof XB1.a0) {
                        u.r = (XB1.a0) i24;
                        return;
                    } else {
                        u.r = ((XB1.W) i24).d();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.d0 d0Var = new XB1.d0();
                    d0Var.a = this.a;
                    d0Var.b = this.b;
                    g(d0Var, attributes);
                    j(d0Var, attributes);
                    l(d0Var, attributes);
                    f(d0Var, attributes);
                    for (int i25 = 0; i25 < attributes.getLength(); i25++) {
                        String strTrim17 = attributes.getValue(i25).trim();
                        int iB12 = C6133qP.b(attributes, i25);
                        if (iB12 == 25) {
                            XB1.C2378o c2378oS19 = s(strTrim17);
                            d0Var.s = c2378oS19;
                            if (c2378oS19.h()) {
                                throw new ZB1("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iB12 != 26) {
                            switch (iB12) {
                                case 81:
                                    XB1.C2378o c2378oS20 = s(strTrim17);
                                    d0Var.r = c2378oS20;
                                    if (c2378oS20.h()) {
                                        throw new ZB1("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    d0Var.p = s(strTrim17);
                                    break;
                                case 83:
                                    d0Var.q = s(strTrim17);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i25)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i25))) {
                            d0Var.o = strTrim17;
                        }
                    }
                    this.b.f(d0Var);
                    this.b = d0Var;
                    return;
                case 30:
                    if (this.b == null) {
                        throw new ZB1("Invalid document. Root element must be <svg>");
                    }
                    XB1.e0 e0Var = new XB1.e0();
                    e0Var.a = this.a;
                    e0Var.b = this.b;
                    g(e0Var, attributes);
                    f(e0Var, attributes);
                    m(e0Var, attributes);
                    this.b.f(e0Var);
                    this.b = e0Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof XB1.X) {
            a(str);
        }
    }

    public final void G(char[] cArr, int i2, int i3) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i3);
            }
            this.g.append(cArr, i2, i3);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i3);
            }
            this.i.append(cArr, i2, i3);
        } else if (this.b instanceof XB1.X) {
            a(new String(cArr, i2, i3));
        }
    }

    public final void a(String str) {
        XB1.G g2 = (XB1.G) this.b;
        int size = g2.i.size();
        XB1.M m = size == 0 ? null : (XB1.M) g2.i.get(size - 1);
        if (m instanceof XB1.b0) {
            XB1.b0 b0Var = (XB1.b0) m;
            b0Var.c = C5807oq.b(new StringBuilder(), b0Var.c, str);
        } else {
            XB1.I i2 = this.b;
            XB1.b0 b0Var2 = new XB1.b0();
            b0Var2.c = str;
            i2.f(b0Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            g gVar = (g) g.i.get(str2);
            if (gVar == null) {
                gVar = g.h;
            }
            switch (gVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((XB1.M) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        g gVar2 = this.f;
                        if (gVar2 == g.g || gVar2 == g.d) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        C3467dx c3467dx = new C3467dx();
                        c3467dx.a = false;
                        XB1 xb1 = this.a;
                        C3467dx.c cVar = new C3467dx.c(string);
                        cVar.q();
                        xb1.b.b(c3467dx.e(cVar));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
