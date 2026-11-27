package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: aY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2739aY1 extends AbstractC1158Hq {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final a F;
    public final b G;
    public final HashMap H;
    public final HT0<String> I;
    public final ArrayList J;
    public final ZX1 K;
    public final DU0 L;
    public final C3788fU0 M;
    public final C3532eF N;
    public Pc2 O;
    public final C3532eF P;
    public Pc2 Q;
    public final C4036gf0 R;
    public Pc2 S;
    public final C4036gf0 T;
    public Pc2 U;
    public Pc2 V;
    public Pc2 W;

    /* JADX INFO: renamed from: aY1$a */
    public class a extends Paint {
    }

    /* JADX INFO: renamed from: aY1$b */
    public class b extends Paint {
    }

    /* JADX INFO: renamed from: aY1$c */
    public static class c {
        public String a = "";
        public float b = 0.0f;
    }

    public C2739aY1(DU0 du0, ZN0 zn0) {
        C1973Sb c1973Sb;
        C1973Sb c1973Sb2;
        C1895Rb c1895Rb;
        C1895Rb c1895Rb2;
        super(du0, zn0);
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.F = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.G = bVar;
        this.H = new HashMap();
        this.I = new HT0<>();
        this.J = new ArrayList();
        this.L = du0;
        this.M = zn0.b;
        ZX1 zx1 = new ZX1((List) zn0.q.b);
        this.K = zx1;
        zx1.a(this);
        g(zx1);
        C3184cc c3184cc = zn0.r;
        if (c3184cc != null && (c1895Rb2 = c3184cc.a) != null) {
            AbstractC1002Fq<?, ?> abstractC1002FqJ = c1895Rb2.j();
            this.N = (C3532eF) abstractC1002FqJ;
            abstractC1002FqJ.a(this);
            g(abstractC1002FqJ);
        }
        if (c3184cc != null && (c1895Rb = c3184cc.b) != null) {
            AbstractC1002Fq<?, ?> abstractC1002FqJ2 = c1895Rb.j();
            this.P = (C3532eF) abstractC1002FqJ2;
            abstractC1002FqJ2.a(this);
            g(abstractC1002FqJ2);
        }
        if (c3184cc != null && (c1973Sb2 = c3184cc.c) != null) {
            AbstractC1002Fq<?, ?> abstractC1002FqJ3 = c1973Sb2.j();
            this.R = (C4036gf0) abstractC1002FqJ3;
            abstractC1002FqJ3.a(this);
            g(abstractC1002FqJ3);
        }
        if (c3184cc == null || (c1973Sb = c3184cc.d) == null) {
            return;
        }
        AbstractC1002Fq<?, ?> abstractC1002FqJ4 = c1973Sb.j();
        this.T = (C4036gf0) abstractC1002FqJ4;
        abstractC1002FqJ4.a(this);
        g(abstractC1002FqJ4);
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void x(Canvas canvas, L20 l20, int i, float f) {
        PointF pointF = l20.l;
        PointF pointF2 = l20.m;
        float fC = C7857yc2.c();
        float f2 = (i * l20.f * fC) + (pointF == null ? 0.0f : (l20.f * fC) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = l20.d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f3, f2);
        } else if (iOrdinal == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        }
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.InterfaceC5489nK0
    public final void c(ColorFilter colorFilter, NU0 nu0) {
        super.c(colorFilter, nu0);
        PointF pointF = IU0.a;
        if (colorFilter == 1) {
            Pc2 pc2 = this.O;
            if (pc2 != null) {
                q(pc2);
            }
            Pc2 pc3 = new Pc2(nu0, null);
            this.O = pc3;
            pc3.a(this);
            g(this.O);
            return;
        }
        if (colorFilter == 2) {
            Pc2 pc4 = this.Q;
            if (pc4 != null) {
                q(pc4);
            }
            Pc2 pc5 = new Pc2(nu0, null);
            this.Q = pc5;
            pc5.a(this);
            g(this.Q);
            return;
        }
        if (colorFilter == IU0.n) {
            Pc2 pc6 = this.S;
            if (pc6 != null) {
                q(pc6);
            }
            Pc2 pc7 = new Pc2(nu0, null);
            this.S = pc7;
            pc7.a(this);
            g(this.S);
            return;
        }
        if (colorFilter == IU0.o) {
            Pc2 pc8 = this.U;
            if (pc8 != null) {
                q(pc8);
            }
            Pc2 pc9 = new Pc2(nu0, null);
            this.U = pc9;
            pc9.a(this);
            g(this.U);
            return;
        }
        if (colorFilter == IU0.A) {
            Pc2 pc10 = this.V;
            if (pc10 != null) {
                q(pc10);
            }
            Pc2 pc11 = new Pc2(nu0, null);
            this.V = pc11;
            pc11.a(this);
            g(this.V);
            return;
        }
        if (colorFilter != IU0.H) {
            if (colorFilter == IU0.J) {
                ZX1 zx1 = this.K;
                zx1.getClass();
                zx1.k(new YX1(new EU0(), nu0, new L20()));
                return;
            }
            return;
        }
        Pc2 pc12 = this.W;
        if (pc12 != null) {
            q(pc12);
        }
        Pc2 pc13 = new Pc2(nu0, null);
        this.W = pc13;
        pc13.a(this);
        g(this.W);
    }

    @Override // defpackage.AbstractC1158Hq, defpackage.X30
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        C3788fU0 c3788fU0 = this.M;
        rectF.set(0.0f, 0.0f, c3788fU0.j.width(), c3788fU0.j.height());
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0346  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:145:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:149:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x040e  */
    /* JADX WARN: Code duplicated, block: B:171:0x045c  */
    /* JADX WARN: Code duplicated, block: B:174:0x046b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0473  */
    /* JADX WARN: Code duplicated, block: B:177:0x047d A[LOOP:9: B:176:0x047b->B:177:0x047d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x049c  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:203:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x019d  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ce A[LOOP:4: B:64:0x01cc->B:65:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:73:0x0229  */
    @Override // defpackage.AbstractC1158Hq
    public final void l(Canvas canvas, Matrix matrix, int i) {
        String str;
        Typeface typefaceCreateFromAsset;
        int i2;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i3;
        PointF pointF;
        float f;
        float f2;
        List<c> listY;
        int i4;
        int i5;
        String str2;
        int length;
        int iCodePointAt;
        int iCharCount;
        C1833Qg0 c1833Qg0;
        long j;
        HT0<String> ht0;
        StringBuilder sb;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f3;
        int i6;
        PointF pointF2;
        float f4;
        float f5;
        List<c> listY2;
        int i7;
        String str3;
        int i8;
        float f6;
        C2067Tg0 c2067Tg0;
        HashMap map;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i9;
        List list;
        int i10;
        Path pathI;
        C2739aY1 c2739aY1 = this;
        L20 l20F = c2739aY1.K.f();
        C3788fU0 c3788fU0 = c2739aY1.M;
        C1833Qg0 c1833Qg1 = (C1833Qg0) c3788fU0.e.get(l20F.b);
        if (c1833Qg1 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Pc2 pc2 = c2739aY1.O;
        a aVar = c2739aY1.F;
        if (pc2 != null) {
            aVar.setColor(((Integer) pc2.f()).intValue());
        } else {
            C3532eF c3532eF = c2739aY1.N;
            if (c3532eF != null) {
                aVar.setColor(c3532eF.f().intValue());
            } else {
                aVar.setColor(l20F.h);
            }
        }
        Pc2 pc3 = c2739aY1.Q;
        b bVar = c2739aY1.G;
        if (pc3 != null) {
            bVar.setColor(((Integer) pc3.f()).intValue());
        } else {
            C3532eF c3532eF2 = c2739aY1.P;
            if (c3532eF2 != null) {
                bVar.setColor(c3532eF2.f().intValue());
            } else {
                bVar.setColor(l20F.i);
            }
        }
        AbstractC1002Fq<Integer, Integer> abstractC1002Fq = c2739aY1.w.j;
        int iIntValue = ((abstractC1002Fq == null ? 100 : abstractC1002Fq.f().intValue()) * 255) / 100;
        aVar.setAlpha(iIntValue);
        bVar.setAlpha(iIntValue);
        Pc2 pc4 = c2739aY1.S;
        if (pc4 != null) {
            bVar.setStrokeWidth(((Float) pc4.f()).floatValue());
        } else {
            C4036gf0 c4036gf0 = c2739aY1.R;
            if (c4036gf0 != null) {
                bVar.setStrokeWidth(c4036gf0.f().floatValue());
            } else {
                bVar.setStrokeWidth(C7857yc2.c() * l20F.j);
            }
        }
        DU0 du0 = c2739aY1.L;
        Map<String, Typeface> map2 = du0.o;
        C4036gf0 c4036gf1 = c2739aY1.T;
        String str4 = "\n";
        int i11 = -1;
        String str5 = c1833Qg1.c;
        String str6 = c1833Qg1.a;
        if (map2 != null || du0.d.g.g() <= 0) {
            Pc2 pc5 = c2739aY1.W;
            if (pc5 == null || (typefaceCreateFromAsset = (Typeface) pc5.f()) == null) {
                Map<String, Typeface> map3 = du0.o;
                if (map3 != null) {
                    if (map3.containsKey(str6)) {
                        typefaceCreateFromAsset = map3.get(str6);
                    } else {
                        String str7 = c1833Qg1.b;
                        if (map3.containsKey(str7)) {
                            typefaceCreateFromAsset = map3.get(str7);
                        } else {
                            str = str5;
                            String strB = C2629a1.b(str6, "-", str);
                            if (map3.containsKey(strB)) {
                                typefaceCreateFromAsset = map3.get(strB);
                            }
                            if (typefaceCreateFromAsset == null) {
                                typefaceCreateFromAsset = c1833Qg1.d;
                            }
                        }
                    }
                    str4 = "\n";
                    if (typefaceCreateFromAsset == null) {
                        typefaceCreateFromAsset = c1833Qg1.d;
                    }
                } else {
                    str = str5;
                }
                C1989Sg0 c1989Sg0J = du0.j();
                if (c1989Sg0J != null) {
                    X11<String> x11 = c1989Sg0J.a;
                    x11.a = str6;
                    x11.b = str;
                    HashMap map4 = c1989Sg0J.b;
                    Typeface typeface = (Typeface) map4.get(x11);
                    if (typeface != null) {
                        str4 = "\n";
                        typefaceCreateFromAsset = typeface;
                    } else {
                        HashMap map5 = c1989Sg0J.c;
                        Typeface typeface2 = (Typeface) map5.get(str6);
                        if (typeface2 != null) {
                            typefaceCreateFromAsset = typeface2;
                        } else {
                            Typeface typeface3 = c1833Qg1.d;
                            if (typeface3 != null) {
                                typefaceCreateFromAsset = typeface3;
                            } else {
                                typefaceCreateFromAsset = Typeface.createFromAsset(c1989Sg0J.d, "fonts/" + str6 + c1989Sg0J.e);
                                map5.put(str6, typefaceCreateFromAsset);
                            }
                        }
                        boolean zContains = str.contains("Italic");
                        boolean zContains2 = str.contains("Bold");
                        if (zContains && zContains2) {
                            i2 = 3;
                        } else if (zContains) {
                            i2 = 2;
                        } else {
                            i2 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i2) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i2);
                        }
                        map4.put(x11, typefaceCreateFromAsset);
                    }
                } else {
                    str4 = "\n";
                    typefaceCreateFromAsset = null;
                }
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = c1833Qg1.d;
                }
            } else {
                c4036gf1 = c4036gf1;
                str4 = "\n";
            }
            if (typefaceCreateFromAsset != null) {
                String str8 = l20F.a;
                aVar.setTypeface(typefaceCreateFromAsset);
                Pc2 pc6 = c2739aY1.V;
                float fFloatValue3 = pc6 != null ? ((Float) pc6.f()).floatValue() : l20F.c;
                aVar.setTextSize(C7857yc2.c() * fFloatValue3);
                bVar.setTypeface(aVar.getTypeface());
                bVar.setTextSize(aVar.getTextSize());
                float f7 = l20F.e / 10.0f;
                Pc2 pc7 = c2739aY1.U;
                if (pc7 != null) {
                    fFloatValue = ((Float) pc7.f()).floatValue();
                } else {
                    if (c4036gf1 != null) {
                        fFloatValue = c4036gf1.f().floatValue();
                    }
                    fC = ((C7857yc2.c() * f7) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str4, "\r").split("\r"));
                    size = listAsList.size();
                    i3 = 0;
                    while (i3 < size) {
                        String str9 = (String) listAsList.get(i3);
                        pointF = l20F.m;
                        if (pointF == null) {
                            f = 0.0f;
                        } else {
                            f = pointF.x;
                        }
                        f2 = fC;
                        listY = c2739aY1.y(str9, f, c1833Qg1, 0.0f, f2, false);
                        i4 = 0;
                        while (i4 < listY.size()) {
                            c cVar = listY.get(i4);
                            i5 = i11 + 1;
                            canvas.save();
                            x(canvas, l20F, i5, cVar.b);
                            str2 = cVar.a;
                            length = 0;
                            while (length < str2.length()) {
                                iCodePointAt = str2.codePointAt(length);
                                List<c> list2 = listY;
                                int i12 = i4;
                                iCharCount = Character.charCount(iCodePointAt) + length;
                                while (true) {
                                    if (iCharCount < str2.length()) {
                                        c1833Qg0 = c1833Qg1;
                                        break;
                                    }
                                    iCodePointAt2 = str2.codePointAt(iCharCount);
                                    c1833Qg0 = c1833Qg1;
                                    if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                        break;
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    c1833Qg1 = c1833Qg0;
                                }
                                j = iCodePointAt;
                                ht0 = c2739aY1.I;
                                float f8 = f2;
                                if (ht0.d) {
                                    ht0.b();
                                }
                                int i13 = i5;
                                if (U0.c(ht0.e, ht0.h, j) >= 0) {
                                    string = (String) ht0.d(j, null);
                                } else {
                                    sb = c2739aY1.C;
                                    sb.setLength(0);
                                    iCharCount2 = length;
                                    while (iCharCount2 < iCharCount) {
                                        int iCodePointAt3 = str2.codePointAt(iCharCount2);
                                        sb.appendCodePoint(iCodePointAt3);
                                        iCharCount2 += Character.charCount(iCodePointAt3);
                                    }
                                    string = sb.toString();
                                    ht0.g(j, string);
                                }
                                length += string.length();
                                if (l20F.k) {
                                    u(string, aVar, canvas);
                                    u(string, bVar, canvas);
                                } else {
                                    u(string, bVar, canvas);
                                    u(string, aVar, canvas);
                                }
                                canvas.translate(aVar.measureText(string) + f8, 0.0f);
                                c2739aY1 = this;
                                listY = list2;
                                i5 = i13;
                                i4 = i12;
                                c1833Qg1 = c1833Qg0;
                                f2 = f8;
                            }
                            i11 = i5;
                            canvas.restore();
                            i4++;
                            c2739aY1 = this;
                            listY = listY;
                        }
                        i3++;
                        c2739aY1 = this;
                        fC = f2;
                    }
                }
                f7 += fFloatValue;
                fC = ((C7857yc2.c() * f7) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str4, "\r").split("\r"));
                size = listAsList.size();
                i3 = 0;
                while (i3 < size) {
                    String str10 = (String) listAsList.get(i3);
                    pointF = l20F.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fC;
                    listY = c2739aY1.y(str10, f, c1833Qg1, 0.0f, f2, false);
                    i4 = 0;
                    while (i4 < listY.size()) {
                        c cVar2 = listY.get(i4);
                        i5 = i11 + 1;
                        canvas.save();
                        x(canvas, l20F, i5, cVar2.b);
                        str2 = cVar2.a;
                        length = 0;
                        while (length < str2.length()) {
                            iCodePointAt = str2.codePointAt(length);
                            List<c> list3 = listY;
                            int i14 = i4;
                            iCharCount = Character.charCount(iCodePointAt) + length;
                            while (true) {
                                if (iCharCount < str2.length()) {
                                    c1833Qg0 = c1833Qg1;
                                    break;
                                }
                                iCodePointAt2 = str2.codePointAt(iCharCount);
                                c1833Qg0 = c1833Qg1;
                                if (Character.getType(iCodePointAt2) == 16) {
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                c1833Qg1 = c1833Qg0;
                            }
                            j = iCodePointAt;
                            ht0 = c2739aY1.I;
                            float f9 = f2;
                            if (ht0.d) {
                                ht0.b();
                            }
                            int i15 = i5;
                            if (U0.c(ht0.e, ht0.h, j) >= 0) {
                                string = (String) ht0.d(j, null);
                            } else {
                                sb = c2739aY1.C;
                                sb.setLength(0);
                                iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int iCodePointAt4 = str2.codePointAt(iCharCount2);
                                    sb.appendCodePoint(iCodePointAt4);
                                    iCharCount2 += Character.charCount(iCodePointAt4);
                                }
                                string = sb.toString();
                                ht0.g(j, string);
                            }
                            length += string.length();
                            if (l20F.k) {
                                u(string, aVar, canvas);
                                u(string, bVar, canvas);
                            } else {
                                u(string, bVar, canvas);
                                u(string, aVar, canvas);
                            }
                            canvas.translate(aVar.measureText(string) + f9, 0.0f);
                            c2739aY1 = this;
                            listY = list3;
                            i5 = i15;
                            i4 = i14;
                            c1833Qg1 = c1833Qg0;
                            f2 = f9;
                        }
                        i11 = i5;
                        canvas.restore();
                        i4++;
                        c2739aY1 = this;
                        listY = listY;
                    }
                    i3++;
                    c2739aY1 = this;
                    fC = f2;
                }
            }
            canvas2 = canvas;
        } else {
            Pc2 pc8 = c2739aY1.V;
            float fFloatValue4 = pc8 != null ? ((Float) pc8.f()).floatValue() : l20F.c;
            C7857yc2.d(matrix);
            float f10 = fFloatValue4 / 100.0f;
            List listAsList2 = Arrays.asList(l20F.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f11 = l20F.e / 10.0f;
            Pc2 pc9 = c2739aY1.U;
            if (pc9 != null) {
                fFloatValue2 = ((Float) pc9.f()).floatValue();
            } else {
                if (c4036gf1 != null) {
                    fFloatValue2 = c4036gf1.f().floatValue();
                }
                f3 = f11;
                i6 = 0;
                while (i6 < size3) {
                    String str11 = (String) listAsList2.get(i6);
                    pointF2 = l20F.m;
                    if (pointF2 == null) {
                        f4 = 0.0f;
                    } else {
                        f4 = pointF2.x;
                    }
                    int i16 = size3;
                    f5 = f10;
                    int i17 = i6;
                    listY2 = c2739aY1.y(str11, f4, c1833Qg1, f5, f3, true);
                    i7 = 0;
                    while (i7 < listY2.size()) {
                        c cVar3 = listY2.get(i7);
                        List<c> list4 = listY2;
                        int i18 = i11 + 1;
                        canvas.save();
                        int i19 = i7;
                        x(canvas, l20F, i18, cVar3.b);
                        str3 = cVar3.a;
                        i11 = i18;
                        i8 = 0;
                        while (i8 < str3.length()) {
                            String str12 = str3;
                            f6 = f3;
                            c2067Tg0 = (C2067Tg0) c3788fU0.g.d(C2067Tg0.a(str3.charAt(i8), str6, str5), null);
                            if (c2067Tg0 == null) {
                                i8 = i8;
                                listAsList2 = listAsList2;
                                str5 = str5;
                            } else {
                                map = c2739aY1.H;
                                if (map.containsKey(c2067Tg0)) {
                                    list = (List) map.get(c2067Tg0);
                                } else {
                                    arrayList = c2067Tg0.a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i9 = 0;
                                    while (i9 < size2) {
                                        arrayList2.add(new ML(du0, c2739aY1, (YJ1) arrayList.get(i9), c3788fU0));
                                        i9++;
                                        size2 = size2;
                                        arrayList = arrayList;
                                    }
                                    map.put(c2067Tg0, arrayList2);
                                    list = arrayList2;
                                }
                                i10 = 0;
                                while (i10 < list.size()) {
                                    pathI = ((ML) list.get(i10)).i();
                                    pathI.computeBounds(c2739aY1.D, false);
                                    Matrix matrix2 = c2739aY1.E;
                                    matrix2.reset();
                                    List list5 = list;
                                    matrix2.preTranslate(0.0f, (-l20F.g) * C7857yc2.c());
                                    matrix2.preScale(f5, f5);
                                    pathI.transform(matrix2);
                                    if (l20F.k) {
                                        v(pathI, aVar, canvas);
                                        v(pathI, bVar, canvas);
                                    } else {
                                        v(pathI, bVar, canvas);
                                        v(pathI, aVar, canvas);
                                    }
                                    i10++;
                                    list = list5;
                                }
                                canvas.translate((C7857yc2.c() * ((float) c2067Tg0.c) * f5) + f6, 0.0f);
                            }
                            i8++;
                            str3 = str12;
                            f3 = f6;
                            listAsList2 = listAsList2;
                            str5 = str5;
                        }
                        canvas.restore();
                        i7 = i19 + 1;
                        listY2 = list4;
                    }
                    i6 = i17 + 1;
                    f10 = f5;
                    size3 = i16;
                }
                canvas2 = canvas;
            }
            f11 += fFloatValue2;
            f3 = f11;
            i6 = 0;
            while (i6 < size3) {
                String str13 = (String) listAsList2.get(i6);
                pointF2 = l20F.m;
                if (pointF2 == null) {
                    f4 = 0.0f;
                } else {
                    f4 = pointF2.x;
                }
                int i110 = size3;
                f5 = f10;
                int i111 = i6;
                listY2 = c2739aY1.y(str13, f4, c1833Qg1, f5, f3, true);
                i7 = 0;
                while (i7 < listY2.size()) {
                    c cVar4 = listY2.get(i7);
                    List<c> list6 = listY2;
                    int i112 = i11 + 1;
                    canvas.save();
                    int i113 = i7;
                    x(canvas, l20F, i112, cVar4.b);
                    str3 = cVar4.a;
                    i11 = i112;
                    i8 = 0;
                    while (i8 < str3.length()) {
                        String str14 = str3;
                        f6 = f3;
                        c2067Tg0 = (C2067Tg0) c3788fU0.g.d(C2067Tg0.a(str3.charAt(i8), str6, str5), null);
                        if (c2067Tg0 == null) {
                            i8 = i8;
                            listAsList2 = listAsList2;
                            str5 = str5;
                        } else {
                            map = c2739aY1.H;
                            if (map.containsKey(c2067Tg0)) {
                                list = (List) map.get(c2067Tg0);
                            } else {
                                arrayList = c2067Tg0.a;
                                size2 = arrayList.size();
                                arrayList2 = new ArrayList(size2);
                                i9 = 0;
                                while (i9 < size2) {
                                    arrayList2.add(new ML(du0, c2739aY1, (YJ1) arrayList.get(i9), c3788fU0));
                                    i9++;
                                    size2 = size2;
                                    arrayList = arrayList;
                                }
                                map.put(c2067Tg0, arrayList2);
                                list = arrayList2;
                            }
                            i10 = 0;
                            while (i10 < list.size()) {
                                pathI = ((ML) list.get(i10)).i();
                                pathI.computeBounds(c2739aY1.D, false);
                                Matrix matrix3 = c2739aY1.E;
                                matrix3.reset();
                                List list7 = list;
                                matrix3.preTranslate(0.0f, (-l20F.g) * C7857yc2.c());
                                matrix3.preScale(f5, f5);
                                pathI.transform(matrix3);
                                if (l20F.k) {
                                    v(pathI, aVar, canvas);
                                    v(pathI, bVar, canvas);
                                } else {
                                    v(pathI, bVar, canvas);
                                    v(pathI, aVar, canvas);
                                }
                                i10++;
                                list = list7;
                            }
                            canvas.translate((C7857yc2.c() * ((float) c2067Tg0.c) * f5) + f6, 0.0f);
                        }
                        i8++;
                        str3 = str14;
                        f3 = f6;
                        listAsList2 = listAsList2;
                        str5 = str5;
                    }
                    canvas.restore();
                    i7 = i113 + 1;
                    listY2 = list6;
                }
                i6 = i111 + 1;
                f10 = f5;
                size3 = i110;
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final c w(int i) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new c());
        }
        return (c) arrayList.get(i - 1);
    }

    public final List<c> y(String str, float f, C1833Qg0 c1833Qg0, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                f4 = 0.0f;
                C2067Tg0 c2067Tg0 = (C2067Tg0) this.M.g.d(C2067Tg0.a(cCharAt, c1833Qg0.a, c1833Qg0.c), null);
                if (c2067Tg0 != null) {
                    fMeasureText = (C7857yc2.c() * ((float) c2067Tg0.c) * f2) + f3;
                }
            } else {
                f4 = 0.0f;
                fMeasureText = this.F.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f7 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f6 = fMeasureText;
            } else {
                f6 += fMeasureText;
            }
            f5 += fMeasureText;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i++;
                c cVarW = w(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f5 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f7);
                    cVarW.a = strTrim;
                    cVarW.b = length;
                    i2 = i4;
                    i3 = i2;
                    f5 = fMeasureText;
                    f6 = f5;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f5 - f6) - ((strSubstring2.length() - strTrim2.length()) * f7)) - f7;
                    cVarW.a = strTrim2;
                    cVarW.b = length2;
                    f5 = f6;
                    i2 = i3;
                }
            }
        }
        if (f5 > 0.0f) {
            i++;
            c cVarW2 = w(i);
            cVarW2.a = str.substring(i2);
            cVarW2.b = f5;
        }
        return this.J.subList(0, i);
    }
}
