package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.C1379Kl1;
import defpackage.C2425Xl1;
import defpackage.C3079c50;
import defpackage.FK1;
import defpackage.V31;
import defpackage.ZT;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int[] g = {0, 4, 8};
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public String a;
    public String b = "";
    public int c = 0;
    public final HashMap<String, androidx.constraintlayout.widget.a> d = new HashMap<>();
    public boolean e = true;
    public final HashMap<Integer, a> f = new HashMap<>();

    public static class a {
        public int a;
        public String b;
        public final d c;
        public final C0228c d;
        public final b e;
        public final e f;
        public HashMap<String, androidx.constraintlayout.widget.a> g;
        public C0227a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0227a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public final void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public final void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    int i2 = this.a[i];
                    int i3 = this.b[i];
                    int[] iArr = c.g;
                    if (i2 == 6) {
                        aVar.e.D = i3;
                    } else if (i2 == 7) {
                        aVar.e.E = i3;
                    } else if (i2 == 8) {
                        aVar.e.K = i3;
                    } else if (i2 == 27) {
                        aVar.e.F = i3;
                    } else if (i2 == 28) {
                        aVar.e.H = i3;
                    } else if (i2 == 41) {
                        aVar.e.W = i3;
                    } else if (i2 == 42) {
                        aVar.e.X = i3;
                    } else if (i2 == 61) {
                        aVar.e.A = i3;
                    } else if (i2 == 62) {
                        aVar.e.B = i3;
                    } else if (i2 == 72) {
                        aVar.e.g0 = i3;
                    } else if (i2 == 73) {
                        aVar.e.h0 = i3;
                    } else if (i2 == 2) {
                        aVar.e.J = i3;
                    } else if (i2 == 31) {
                        aVar.e.L = i3;
                    } else if (i2 == 34) {
                        aVar.e.I = i3;
                    } else if (i2 == 38) {
                        aVar.a = i3;
                    } else if (i2 == 64) {
                        aVar.d.b = i3;
                    } else if (i2 == 66) {
                        aVar.d.f = i3;
                    } else if (i2 == 76) {
                        aVar.d.e = i3;
                    } else if (i2 == 78) {
                        aVar.c.c = i3;
                    } else if (i2 == 97) {
                        aVar.e.p0 = i3;
                    } else if (i2 == 93) {
                        aVar.e.M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                aVar.e.Q = i3;
                                break;
                            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                aVar.e.R = i3;
                                break;
                            case 13:
                                aVar.e.N = i3;
                                break;
                            case 14:
                                aVar.e.P = i3;
                                break;
                            case 15:
                                aVar.e.S = i3;
                                break;
                            case 16:
                                aVar.e.O = i3;
                                break;
                            case 17:
                                aVar.e.e = i3;
                                break;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                aVar.e.f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        aVar.e.d = i3;
                                        break;
                                    case 22:
                                        aVar.c.b = i3;
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        aVar.e.c = i3;
                                        break;
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        aVar.e.G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                aVar.e.Y = i3;
                                                break;
                                            case 55:
                                                aVar.e.Z = i3;
                                                break;
                                            case 56:
                                                aVar.e.a0 = i3;
                                                break;
                                            case 57:
                                                aVar.e.b0 = i3;
                                                break;
                                            case 58:
                                                aVar.e.c0 = i3;
                                                break;
                                            case 59:
                                                aVar.e.d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        aVar.d.c = i3;
                                                        break;
                                                    case 83:
                                                        aVar.f.i = i3;
                                                        break;
                                                    case 84:
                                                        aVar.d.j = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                aVar.d.l = i3;
                                                                break;
                                                            case 89:
                                                                aVar.d.m = i3;
                                                                break;
                                                            default:
                                                                b0.e("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.e.T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f; i4++) {
                    int i5 = this.d[i4];
                    float f = this.e[i4];
                    int[] iArr2 = c.g;
                    if (i5 == 19) {
                        aVar.e.g = f;
                    } else if (i5 == 20) {
                        aVar.e.x = f;
                    } else if (i5 == 37) {
                        aVar.e.y = f;
                    } else if (i5 == 60) {
                        aVar.f.b = f;
                    } else if (i5 == 63) {
                        aVar.e.C = f;
                    } else if (i5 == 79) {
                        aVar.d.g = f;
                    } else if (i5 == 85) {
                        aVar.d.i = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            aVar.e.V = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    aVar.c.d = f;
                                    break;
                                case 44:
                                    e eVar = aVar.f;
                                    eVar.n = f;
                                    eVar.m = true;
                                    break;
                                case 45:
                                    aVar.f.c = f;
                                    break;
                                case 46:
                                    aVar.f.d = f;
                                    break;
                                case 47:
                                    aVar.f.e = f;
                                    break;
                                case 48:
                                    aVar.f.f = f;
                                    break;
                                case 49:
                                    aVar.f.g = f;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    aVar.f.h = f;
                                    break;
                                case 51:
                                    aVar.f.j = f;
                                    break;
                                case 52:
                                    aVar.f.k = f;
                                    break;
                                case 53:
                                    aVar.f.l = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            aVar.d.h = f;
                                            break;
                                        case 68:
                                            aVar.c.e = f;
                                            break;
                                        case 69:
                                            aVar.e.e0 = f;
                                            break;
                                        case 70:
                                            aVar.e.f0 = f;
                                            break;
                                        default:
                                            b0.e("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            aVar.e.U = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    int i7 = this.g[i6];
                    String str = this.h[i6];
                    int[] iArr3 = c.g;
                    if (i7 == 5) {
                        aVar.e.z = str;
                    } else if (i7 == 65) {
                        aVar.d.d = str;
                    } else if (i7 == 74) {
                        b bVar = aVar.e;
                        bVar.k0 = str;
                        bVar.j0 = null;
                    } else if (i7 == 77) {
                        aVar.e.l0 = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            b0.e("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.d.k = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.l; i8++) {
                    int i9 = this.j[i8];
                    boolean z = this.k[i8];
                    int[] iArr4 = c.g;
                    if (i9 == 44) {
                        aVar.f.m = z;
                    } else if (i9 == 75) {
                        aVar.e.o0 = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            aVar.e.m0 = z;
                        } else if (i9 != 81) {
                            b0.e("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.e.n0 = z;
                        }
                    }
                }
            }
        }

        public a() {
            d dVar = new d();
            dVar.a = false;
            dVar.b = 0;
            dVar.c = 0;
            dVar.d = 1.0f;
            dVar.e = Float.NaN;
            this.c = dVar;
            C0228c c0228c = new C0228c();
            c0228c.a = false;
            c0228c.b = -1;
            c0228c.c = 0;
            c0228c.d = null;
            c0228c.e = -1;
            c0228c.f = 0;
            c0228c.g = Float.NaN;
            c0228c.h = Float.NaN;
            c0228c.i = Float.NaN;
            c0228c.j = -1;
            c0228c.k = null;
            c0228c.l = -3;
            c0228c.m = -1;
            this.d = c0228c;
            this.e = new b();
            e eVar = new e();
            eVar.a = false;
            eVar.b = 0.0f;
            eVar.c = 0.0f;
            eVar.d = 0.0f;
            eVar.e = 1.0f;
            eVar.f = 1.0f;
            eVar.g = Float.NaN;
            eVar.h = Float.NaN;
            eVar.i = -1;
            eVar.j = 0.0f;
            eVar.k = 0.0f;
            eVar.l = 0.0f;
            eVar.m = false;
            eVar.n = 0.0f;
            this.f = eVar;
            this.g = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.e;
            aVar.e = bVar.i;
            aVar.f = bVar.j;
            aVar.g = bVar.k;
            aVar.h = bVar.l;
            aVar.i = bVar.m;
            aVar.j = bVar.n;
            aVar.k = bVar.o;
            aVar.l = bVar.p;
            aVar.m = bVar.q;
            aVar.n = bVar.r;
            aVar.o = bVar.s;
            aVar.s = bVar.t;
            aVar.t = bVar.u;
            aVar.u = bVar.v;
            aVar.v = bVar.w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.x = bVar.O;
            aVar.z = bVar.Q;
            aVar.E = bVar.x;
            aVar.F = bVar.y;
            aVar.p = bVar.A;
            aVar.q = bVar.B;
            aVar.r = bVar.C;
            aVar.G = bVar.z;
            aVar.T = bVar.D;
            aVar.U = bVar.E;
            aVar.I = bVar.U;
            aVar.H = bVar.V;
            aVar.K = bVar.X;
            aVar.J = bVar.W;
            aVar.W = bVar.m0;
            aVar.X = bVar.n0;
            aVar.L = bVar.Y;
            aVar.M = bVar.Z;
            aVar.P = bVar.a0;
            aVar.Q = bVar.b0;
            aVar.N = bVar.c0;
            aVar.O = bVar.d0;
            aVar.R = bVar.e0;
            aVar.S = bVar.f0;
            aVar.V = bVar.F;
            aVar.c = bVar.g;
            aVar.a = bVar.e;
            aVar.b = bVar.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.c;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.d;
            String str = bVar.l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.p0;
            aVar.setMarginStart(bVar.L);
            aVar.setMarginEnd(bVar.K);
            aVar.a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            d dVar = aVar.c;
            d dVar2 = this.c;
            dVar.a = dVar2.a;
            dVar.b = dVar2.b;
            dVar.d = dVar2.d;
            dVar.e = dVar2.e;
            dVar.c = dVar2.c;
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void c(int i, ConstraintLayout.a aVar) {
            this.a = i;
            int i2 = aVar.e;
            b bVar = this.e;
            bVar.i = i2;
            bVar.j = aVar.f;
            bVar.k = aVar.g;
            bVar.l = aVar.h;
            bVar.m = aVar.i;
            bVar.n = aVar.j;
            bVar.o = aVar.k;
            bVar.p = aVar.l;
            bVar.q = aVar.m;
            bVar.r = aVar.n;
            bVar.s = aVar.o;
            bVar.t = aVar.s;
            bVar.u = aVar.t;
            bVar.v = aVar.u;
            bVar.w = aVar.v;
            bVar.x = aVar.E;
            bVar.y = aVar.F;
            bVar.z = aVar.G;
            bVar.A = aVar.p;
            bVar.B = aVar.q;
            bVar.C = aVar.r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.g = aVar.c;
            bVar.e = aVar.a;
            bVar.f = aVar.b;
            bVar.c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.M = aVar.D;
            bVar.U = aVar.I;
            bVar.V = aVar.H;
            bVar.X = aVar.K;
            bVar.W = aVar.J;
            bVar.m0 = aVar.W;
            bVar.n0 = aVar.X;
            bVar.Y = aVar.L;
            bVar.Z = aVar.M;
            bVar.a0 = aVar.P;
            bVar.b0 = aVar.Q;
            bVar.c0 = aVar.N;
            bVar.d0 = aVar.O;
            bVar.e0 = aVar.R;
            bVar.f0 = aVar.S;
            bVar.l0 = aVar.Y;
            bVar.O = aVar.x;
            bVar.Q = aVar.z;
            bVar.N = aVar.w;
            bVar.P = aVar.y;
            bVar.S = aVar.A;
            bVar.R = aVar.B;
            bVar.T = aVar.C;
            bVar.p0 = aVar.Z;
            bVar.K = aVar.getMarginEnd();
            bVar.L = aVar.getMarginStart();
        }

        public final void d(int i, androidx.constraintlayout.widget.d.a aVar) {
            c(i, aVar);
            this.c.d = aVar.r0;
            float f = aVar.u0;
            e eVar = this.f;
            eVar.b = f;
            eVar.c = aVar.v0;
            eVar.d = aVar.w0;
            eVar.e = aVar.x0;
            eVar.f = aVar.y0;
            eVar.g = aVar.z0;
            eVar.h = aVar.A0;
            eVar.j = aVar.B0;
            eVar.k = aVar.C0;
            eVar.l = aVar.D0;
            eVar.n = aVar.t0;
            eVar.m = aVar.s0;
        }
    }

    public static class b {
        public static final SparseIntArray q0;
        public int c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.l0 = bVar.l0;
            int[] iArr = bVar.j0;
            if (iArr == null || bVar.k0 != null) {
                this.j0 = null;
            } else {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.k0 = bVar.k0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.k);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = c.l(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = c.l(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = c.l(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = c.l(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = c.l(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.i = c.l(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 25:
                        this.j = c.l(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = c.l(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = c.l(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.t = c.l(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        this.u = c.l(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.n = c.l(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = c.l(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 36:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        c.m(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.m(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = c.l(typedArrayObtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        b0.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = typedArrayObtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case 73:
                                        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case 74:
                                        this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 76:
                                        this.p0 = typedArrayObtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case 77:
                                        this.r = c.l(typedArrayObtainStyledAttributes, index, this.r);
                                        break;
                                    case 78:
                                        this.s = c.l(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 84:
                                        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 86 */:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 87:
                                        this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 88:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 89:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case 91:
                                        b0.e("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        b0.e("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0228c {
        public static final SparseIntArray n;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(C0228c c0228c) {
            this.a = c0228c.a;
            this.b = c0228c.b;
            this.d = c0228c.d;
            this.e = c0228c.e;
            this.f = c0228c.f;
            this.h = c0228c.h;
            this.g = c0228c.g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.l);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = C3079c50.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.l(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.m = resourceId;
                            if (resourceId != -1) {
                                this.l = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf("/") > 0) {
                                this.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                            } else {
                                this.l = -1;
                            }
                        } else {
                            this.l = typedArrayObtainStyledAttributes.getInteger(index, this.m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.r);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = c.g[i2];
                } else if (index == 4) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static final SparseIntArray o;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.u);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        this.i = c.l(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, C2425Xl1.c);
        o(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Integer num = null;
            try {
                iIntValue = C1379Kl1.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.q;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.q.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static a g(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C2425Xl1.c : C2425Xl1.a);
        if (z) {
            o(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                b bVar = aVar.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    d dVar = aVar.c;
                    e eVar = aVar.f;
                    C0228c c0228c = aVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        c0228c.a = true;
                        bVar.b = true;
                        dVar.a = true;
                        eVar.a = true;
                    }
                    SparseIntArray sparseIntArray = h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.q = l(typedArrayObtainStyledAttributes, index, bVar.q);
                            break;
                        case 2:
                            bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.p = l(typedArrayObtainStyledAttributes, index, bVar.p);
                            break;
                        case 4:
                            bVar.o = l(typedArrayObtainStyledAttributes, index, bVar.o);
                            break;
                        case 5:
                            bVar.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.w = l(typedArrayObtainStyledAttributes, index, bVar.w);
                            break;
                        case 10:
                            bVar.v = l(typedArrayObtainStyledAttributes, index, bVar.v);
                            break;
                        case 11:
                            bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.e);
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            bVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f);
                            break;
                        case 19:
                            bVar.g = typedArrayObtainStyledAttributes.getFloat(index, bVar.g);
                            break;
                        case 20:
                            bVar.x = typedArrayObtainStyledAttributes.getFloat(index, bVar.x);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            bVar.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, dVar.b);
                            dVar.b = i3;
                            dVar.b = g[i3];
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            bVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.c);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.i = l(typedArrayObtainStyledAttributes, index, bVar.i);
                            break;
                        case 26:
                            bVar.j = l(typedArrayObtainStyledAttributes, index, bVar.j);
                            break;
                        case 27:
                            bVar.F = typedArrayObtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.k = l(typedArrayObtainStyledAttributes, index, bVar.k);
                            break;
                        case 30:
                            bVar.l = l(typedArrayObtainStyledAttributes, index, bVar.l);
                            break;
                        case 31:
                            bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                            bVar.t = l(typedArrayObtainStyledAttributes, index, bVar.t);
                            break;
                        case 33:
                            bVar.u = l(typedArrayObtainStyledAttributes, index, bVar.u);
                            break;
                        case 34:
                            bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.n = l(typedArrayObtainStyledAttributes, index, bVar.n);
                            break;
                        case 36:
                            bVar.m = l(typedArrayObtainStyledAttributes, index, bVar.m);
                            break;
                        case 37:
                            bVar.y = typedArrayObtainStyledAttributes.getFloat(index, bVar.y);
                            break;
                        case 38:
                            aVar.a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        case 39:
                            bVar.V = typedArrayObtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            bVar.U = typedArrayObtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            bVar.W = typedArrayObtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = typedArrayObtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            dVar.d = typedArrayObtainStyledAttributes.getFloat(index, dVar.d);
                            break;
                        case 44:
                            eVar.m = true;
                            eVar.n = typedArrayObtainStyledAttributes.getDimension(index, eVar.n);
                            break;
                        case 45:
                            eVar.c = typedArrayObtainStyledAttributes.getFloat(index, eVar.c);
                            break;
                        case 46:
                            eVar.d = typedArrayObtainStyledAttributes.getFloat(index, eVar.d);
                            break;
                        case 47:
                            eVar.e = typedArrayObtainStyledAttributes.getFloat(index, eVar.e);
                            break;
                        case 48:
                            eVar.f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f);
                            break;
                        case 49:
                            eVar.g = typedArrayObtainStyledAttributes.getDimension(index, eVar.g);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            eVar.h = typedArrayObtainStyledAttributes.getDimension(index, eVar.h);
                            break;
                        case 51:
                            eVar.j = typedArrayObtainStyledAttributes.getDimension(index, eVar.j);
                            break;
                        case 52:
                            eVar.k = typedArrayObtainStyledAttributes.getDimension(index, eVar.k);
                            break;
                        case 53:
                            eVar.l = typedArrayObtainStyledAttributes.getDimension(index, eVar.l);
                            break;
                        case 54:
                            bVar.Y = typedArrayObtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case 55:
                            bVar.Z = typedArrayObtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.a0);
                            break;
                        case 57:
                            bVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.b0);
                            break;
                        case 58:
                            bVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.c0);
                            break;
                        case 59:
                            bVar.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.d0);
                            break;
                        case 60:
                            eVar.b = typedArrayObtainStyledAttributes.getFloat(index, eVar.b);
                            break;
                        case 61:
                            bVar.A = l(typedArrayObtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case 63:
                            bVar.C = typedArrayObtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            c0228c.b = l(typedArrayObtainStyledAttributes, index, c0228c.b);
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                c0228c.d = C3079c50.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                c0228c.d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            c0228c.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            c0228c.h = typedArrayObtainStyledAttributes.getFloat(index, c0228c.h);
                            break;
                        case 68:
                            dVar.e = typedArrayObtainStyledAttributes.getFloat(index, dVar.e);
                            break;
                        case 69:
                            bVar.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            b0.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            bVar.g0 = typedArrayObtainStyledAttributes.getInt(index, bVar.g0);
                            break;
                        case 73:
                            bVar.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.h0);
                            break;
                        case 74:
                            bVar.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.o0);
                            break;
                        case 76:
                            c0228c.e = typedArrayObtainStyledAttributes.getInt(index, c0228c.e);
                            break;
                        case 77:
                            bVar.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.c = typedArrayObtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case 79:
                            c0228c.g = typedArrayObtainStyledAttributes.getFloat(index, c0228c.g);
                            break;
                        case 80:
                            bVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.m0);
                            break;
                        case 81:
                            bVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.n0);
                            break;
                        case 82:
                            c0228c.c = typedArrayObtainStyledAttributes.getInteger(index, c0228c.c);
                            break;
                        case 83:
                            eVar.i = l(typedArrayObtainStyledAttributes, index, eVar.i);
                            break;
                        case 84:
                            c0228c.j = typedArrayObtainStyledAttributes.getInteger(index, c0228c.j);
                            break;
                        case 85:
                            c0228c.i = typedArrayObtainStyledAttributes.getFloat(index, c0228c.i);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 86 */:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0228c.m = resourceId;
                                if (resourceId != -1) {
                                    c0228c.l = -2;
                                }
                            } else if (i4 != 3) {
                                c0228c.l = typedArrayObtainStyledAttributes.getInteger(index, c0228c.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                c0228c.k = string;
                                if (string.indexOf("/") <= 0) {
                                    c0228c.l = -1;
                                } else {
                                    c0228c.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    c0228c.l = -2;
                                }
                            }
                            break;
                        case 87:
                            b0.e("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            b0.e("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            bVar.r = l(typedArrayObtainStyledAttributes, index, bVar.r);
                            break;
                        case 92:
                            bVar.s = l(typedArrayObtainStyledAttributes, index, bVar.s);
                            break;
                        case 93:
                            bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case 94:
                            bVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case 95:
                            m(bVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(bVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.p0 = typedArrayObtainStyledAttributes.getInt(index, bVar.p0);
                            break;
                    }
                    i2++;
                } else if (bVar.k0 != null) {
                    bVar.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int l(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void m(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        a.C0227a c0227a;
        b bVar;
        ConstraintLayout.a aVar;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 != 3) {
            if (i4 != 5) {
                dimensionPixelSize = typedArray.getInt(i2, 0);
                if (dimensionPixelSize == -4) {
                    i5 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.a) {
                    aVar = (ConstraintLayout.a) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                        aVar.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                        aVar.X = z;
                        return;
                    }
                }
                if (obj instanceof b) {
                    bVar = (b) obj;
                    if (i3 == 0) {
                        bVar.c = i5;
                        bVar.m0 = z;
                        return;
                    } else {
                        bVar.d = i5;
                        bVar.n0 = z;
                        return;
                    }
                }
                if (obj instanceof a.C0227a) {
                    c0227a = (a.C0227a) obj;
                    if (i3 == 0) {
                        c0227a.b(23, i5);
                        c0227a.d(80, z);
                        return;
                    } else {
                        c0227a.b(21, i5);
                        c0227a.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
            z = false;
            i5 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.a) {
                aVar = (ConstraintLayout.a) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                    aVar.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                    aVar.X = z;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i3 == 0) {
                    bVar.c = i5;
                    bVar.m0 = z;
                    return;
                } else {
                    bVar.d = i5;
                    bVar.n0 = z;
                    return;
                }
            }
            if (obj instanceof a.C0227a) {
                c0227a = (a.C0227a) obj;
                if (i3 == 0) {
                    c0227a.b(23, i5);
                    c0227a.d(80, z);
                    return;
                } else {
                    c0227a.b(21, i5);
                    c0227a.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i2);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.a) {
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                    }
                    n(aVar2, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0227a) {
                        ((a.C0227a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                            aVar3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                            aVar3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i3 == 0) {
                            bVar2.c = 0;
                            bVar2.V = f;
                            return;
                        } else {
                            bVar2.d = 0;
                            bVar2.U = f;
                            return;
                        }
                    }
                    if (obj instanceof a.C0227a) {
                        a.C0227a c0227a2 = (a.C0227a) obj;
                        if (i3 == 0) {
                            c0227a2.b(23, 0);
                            c0227a2.a(39, f);
                            return;
                        } else {
                            c0227a2.b(21, 0);
                            c0227a2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar4).width = 0;
                            aVar4.R = fMax;
                            aVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar4).height = 0;
                            aVar4.S = fMax;
                            aVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i3 == 0) {
                            bVar3.c = 0;
                            bVar3.e0 = fMax;
                            bVar3.Y = 2;
                            return;
                        } else {
                            bVar3.d = 0;
                            bVar3.f0 = fMax;
                            bVar3.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0227a) {
                        a.C0227a c0227a3 = (a.C0227a) obj;
                        if (i3 == 0) {
                            c0227a3.b(23, 0);
                            c0227a3.b(54, 2);
                        } else {
                            c0227a3.b(21, 0);
                            c0227a3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void n(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public static void o(a aVar, TypedArray typedArray) {
        boolean z;
        int indexCount = typedArray.getIndexCount();
        a.C0227a c0227a = new a.C0227a();
        aVar.h = c0227a;
        C0228c c0228c = aVar.d;
        c0228c.a = false;
        b bVar = aVar.e;
        bVar.b = false;
        d dVar = aVar.c;
        dVar.a = false;
        e eVar = aVar.f;
        eVar.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = i.get(index);
            SparseIntArray sparseIntArray = h;
            switch (i3) {
                case 2:
                    z = false;
                    c0227a.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
                    continue;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    b0.e("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    z = false;
                    c0227a.c(5, typedArray.getString(index));
                    continue;
                    break;
                case 6:
                    z = false;
                    c0227a.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    continue;
                    break;
                case 7:
                    z = false;
                    c0227a.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    continue;
                    break;
                case 8:
                    z = false;
                    c0227a.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    continue;
                    break;
                case 11:
                    z = false;
                    c0227a.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    continue;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    z = false;
                    c0227a.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    continue;
                    break;
                case 13:
                    z = false;
                    c0227a.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    continue;
                    break;
                case 14:
                    z = false;
                    c0227a.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    continue;
                    break;
                case 15:
                    z = false;
                    c0227a.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    continue;
                    break;
                case 16:
                    z = false;
                    c0227a.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    continue;
                    break;
                case 17:
                    z = false;
                    c0227a.b(17, typedArray.getDimensionPixelOffset(index, bVar.e));
                    continue;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    z = false;
                    c0227a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f));
                    continue;
                    break;
                case 19:
                    z = false;
                    c0227a.a(19, typedArray.getFloat(index, bVar.g));
                    continue;
                    break;
                case 20:
                    z = false;
                    c0227a.a(20, typedArray.getFloat(index, bVar.x));
                    continue;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    z = false;
                    c0227a.b(21, typedArray.getLayoutDimension(index, bVar.d));
                    continue;
                    break;
                case 22:
                    z = false;
                    c0227a.b(22, g[typedArray.getInt(index, dVar.b)]);
                    continue;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    z = false;
                    c0227a.b(23, typedArray.getLayoutDimension(index, bVar.c));
                    continue;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z = false;
                    c0227a.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    continue;
                    break;
                case 27:
                    z = false;
                    c0227a.b(27, typedArray.getInt(index, bVar.F));
                    continue;
                    break;
                case 28:
                    z = false;
                    c0227a.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    continue;
                    break;
                case 31:
                    z = false;
                    c0227a.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    continue;
                    break;
                case 34:
                    z = false;
                    c0227a.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    continue;
                    break;
                case 37:
                    z = false;
                    c0227a.a(37, typedArray.getFloat(index, bVar.y));
                    continue;
                    break;
                case 38:
                    z = false;
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0227a.b(38, resourceId);
                    continue;
                    break;
                case 39:
                    z = false;
                    c0227a.a(39, typedArray.getFloat(index, bVar.V));
                    continue;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    z = false;
                    c0227a.a(40, typedArray.getFloat(index, bVar.U));
                    continue;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    z = false;
                    c0227a.b(41, typedArray.getInt(index, bVar.W));
                    continue;
                    break;
                case 42:
                    z = false;
                    c0227a.b(42, typedArray.getInt(index, bVar.X));
                    continue;
                    break;
                case 43:
                    z = false;
                    c0227a.a(43, typedArray.getFloat(index, dVar.d));
                    continue;
                    break;
                case 44:
                    z = false;
                    c0227a.d(44, true);
                    c0227a.a(44, typedArray.getDimension(index, eVar.n));
                    continue;
                    break;
                case 45:
                    z = false;
                    c0227a.a(45, typedArray.getFloat(index, eVar.c));
                    continue;
                    break;
                case 46:
                    z = false;
                    c0227a.a(46, typedArray.getFloat(index, eVar.d));
                    continue;
                    break;
                case 47:
                    z = false;
                    c0227a.a(47, typedArray.getFloat(index, eVar.e));
                    continue;
                    break;
                case 48:
                    z = false;
                    c0227a.a(48, typedArray.getFloat(index, eVar.f));
                    continue;
                    break;
                case 49:
                    z = false;
                    c0227a.a(49, typedArray.getDimension(index, eVar.g));
                    continue;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    z = false;
                    c0227a.a(50, typedArray.getDimension(index, eVar.h));
                    continue;
                    break;
                case 51:
                    z = false;
                    c0227a.a(51, typedArray.getDimension(index, eVar.j));
                    continue;
                    break;
                case 52:
                    z = false;
                    c0227a.a(52, typedArray.getDimension(index, eVar.k));
                    continue;
                    break;
                case 53:
                    z = false;
                    c0227a.a(53, typedArray.getDimension(index, eVar.l));
                    continue;
                    break;
                case 54:
                    z = false;
                    c0227a.b(54, typedArray.getInt(index, bVar.Y));
                    continue;
                    break;
                case 55:
                    z = false;
                    c0227a.b(55, typedArray.getInt(index, bVar.Z));
                    continue;
                    break;
                case 56:
                    z = false;
                    c0227a.b(56, typedArray.getDimensionPixelSize(index, bVar.a0));
                    continue;
                    break;
                case 57:
                    z = false;
                    c0227a.b(57, typedArray.getDimensionPixelSize(index, bVar.b0));
                    continue;
                    break;
                case 58:
                    z = false;
                    c0227a.b(58, typedArray.getDimensionPixelSize(index, bVar.c0));
                    continue;
                    break;
                case 59:
                    z = false;
                    c0227a.b(59, typedArray.getDimensionPixelSize(index, bVar.d0));
                    continue;
                    break;
                case 60:
                    z = false;
                    c0227a.a(60, typedArray.getFloat(index, eVar.b));
                    continue;
                    break;
                case 62:
                    z = false;
                    c0227a.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    continue;
                    break;
                case 63:
                    z = false;
                    c0227a.a(63, typedArray.getFloat(index, bVar.C));
                    continue;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    z = false;
                    c0227a.b(64, l(typedArray, index, c0228c.b));
                    continue;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    z = false;
                    if (typedArray.peekValue(index).type == 3) {
                        c0227a.c(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0227a.c(65, C3079c50.c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    z = false;
                    c0227a.b(66, typedArray.getInt(index, 0));
                    continue;
                    break;
                case 67:
                    c0227a.a(67, typedArray.getFloat(index, c0228c.h));
                    break;
                case 68:
                    c0227a.a(68, typedArray.getFloat(index, dVar.e));
                    break;
                case 69:
                    c0227a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0227a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    b0.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0227a.b(72, typedArray.getInt(index, bVar.g0));
                    break;
                case 73:
                    c0227a.b(73, typedArray.getDimensionPixelSize(index, bVar.h0));
                    break;
                case 74:
                    c0227a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0227a.d(75, typedArray.getBoolean(index, bVar.o0));
                    break;
                case 76:
                    c0227a.b(76, typedArray.getInt(index, c0228c.e));
                    break;
                case 77:
                    c0227a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0227a.b(78, typedArray.getInt(index, dVar.c));
                    break;
                case 79:
                    c0227a.a(79, typedArray.getFloat(index, c0228c.g));
                    break;
                case 80:
                    c0227a.d(80, typedArray.getBoolean(index, bVar.m0));
                    break;
                case 81:
                    c0227a.d(81, typedArray.getBoolean(index, bVar.n0));
                    break;
                case 82:
                    c0227a.b(82, typedArray.getInteger(index, c0228c.c));
                    break;
                case 83:
                    c0227a.b(83, l(typedArray, index, eVar.i));
                    break;
                case 84:
                    c0227a.b(84, typedArray.getInteger(index, c0228c.j));
                    break;
                case 85:
                    c0227a.a(85, typedArray.getFloat(index, c0228c.i));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 86 */:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        c0228c.m = resourceId2;
                        c0227a.b(89, resourceId2);
                        if (c0228c.m != -1) {
                            c0228c.l = -2;
                            c0227a.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        c0228c.k = string;
                        c0227a.c(90, string);
                        if (c0228c.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            c0228c.m = resourceId3;
                            c0227a.b(89, resourceId3);
                            c0228c.l = -2;
                            c0227a.b(88, -2);
                        } else {
                            c0228c.l = -1;
                            c0227a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, c0228c.m);
                        c0228c.l = integer;
                        c0227a.b(88, integer);
                    }
                    break;
                case 87:
                    b0.e("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    c0227a.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    break;
                case 94:
                    c0227a.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    break;
                case 95:
                    m(c0227a, typedArray, index, 0);
                    z = false;
                    continue;
                    break;
                case 96:
                    m(c0227a, typedArray, index, 1);
                    break;
                case 97:
                    c0227a.b(97, typedArray.getInt(index, bVar.p0));
                    break;
                case 98:
                    if (MotionLayout.K0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    break;
                case 99:
                    c0227a.d(99, typedArray.getBoolean(index, bVar.h));
                    break;
            }
            z = false;
        }
    }

    public static String p(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            HashMap<Integer, a> map = this.f;
            if (!map.containsKey(Integer.valueOf(id))) {
                b0.e("ConstraintSet", "id unknown " + ZT.d(childAt));
            } else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (aVar = map.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.f;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                b0.e("ConstraintSet", "id unknown " + ZT.d(childAt));
            } else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = map.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            b bVar = aVar.e;
                            bVar.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(bVar.g0);
                            barrier.setMargin(bVar.h0);
                            barrier.setAllowsGoneWidget(bVar.o0);
                            int[] iArr = bVar.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.k0;
                                if (str != null) {
                                    int[] iArrF = f(barrier, str);
                                    bVar.j0 = iArrF;
                                    barrier.setReferencedIds(iArrF);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(dVar.d);
                        e eVar = aVar.f;
                        childAt.setRotation(eVar.b);
                        childAt.setRotationX(eVar.c);
                        childAt.setRotationY(eVar.d);
                        childAt.setScaleX(eVar.e);
                        childAt.setScaleY(eVar.f);
                        if (eVar.i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.g)) {
                                childAt.setPivotX(eVar.g);
                            }
                            if (!Float.isNaN(eVar.h)) {
                                childAt.setPivotY(eVar.h);
                            }
                        }
                        childAt.setTranslationX(eVar.j);
                        childAt.setTranslationY(eVar.k);
                        childAt.setTranslationZ(eVar.l);
                        if (eVar.m) {
                            childAt.setElevation(eVar.n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = map.get(num);
            if (aVar3 != null) {
                b bVar2 = aVar3.e;
                if (bVar2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.k0;
                        if (str2 != null) {
                            int[] iArrF2 = f(barrier2, str2);
                            bVar2.j0 = iArrF2;
                            barrier2.setReferencedIds(iArrF2);
                        }
                    }
                    barrier2.setType(bVar2.g0);
                    barrier2.setMargin(bVar2.h0);
                    FK1 fk1 = ConstraintLayout.v;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a(-2, -2);
                    barrier2.n();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (bVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    FK1 fk2 = ConstraintLayout.v;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a(-2, -2);
                    aVar3.a(aVar5);
                    constraintLayout.addView(guideline, aVar5);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).g(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        int i3;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = cVar.f;
        map.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new a());
            }
            a aVar2 = map.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i2 = childCount;
            } else {
                HashMap<String, androidx.constraintlayout.widget.a> map2 = cVar.d;
                HashMap<String, androidx.constraintlayout.widget.a> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    androidx.constraintlayout.widget.a aVar3 = map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i3 = childCount;
                        } else {
                            i3 = childCount;
                            try {
                                map3.put(str, new androidx.constraintlayout.widget.a(aVar3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        i3 = childCount;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        i3 = childCount;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        i3 = childCount;
                    }
                    childCount = i3;
                }
                i2 = childCount;
                aVar2.g = map3;
                aVar2.c(id, aVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar2.c;
                dVar.b = visibility;
                dVar.d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar2.f;
                eVar.b = rotation;
                eVar.c = childAt.getRotationX();
                eVar.d = childAt.getRotationY();
                eVar.e = childAt.getScaleX();
                eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                eVar.j = childAt.getTranslationX();
                eVar.k = childAt.getTranslationY();
                eVar.l = childAt.getTranslationZ();
                if (eVar.m) {
                    eVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar = aVar2.e;
                    bVar.o0 = allowsGoneWidget;
                    bVar.j0 = barrier.getReferencedIds();
                    bVar.g0 = barrier.getType();
                    bVar.h0 = barrier.getMargin();
                }
            }
            i4++;
            cVar = this;
            childCount = i2;
        }
    }

    public final a h(int i2) {
        HashMap<Integer, a> map = this.f;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), new a());
        }
        return map.get(Integer.valueOf(i2));
    }

    public final a i(int i2) {
        HashMap<Integer, a> map = this.f;
        if (map.containsKey(Integer.valueOf(i2))) {
            return map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void j(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarG = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarG.e.a = true;
                    }
                    this.f.put(Integer.valueOf(aVarG.a), aVarG);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVarG = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            b bVar = aVarG.e;
                            bVar.a = true;
                            bVar.b = true;
                            break;
                        case "Barrier":
                            aVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            aVarG.e.i0 = 1;
                            break;
                        case "PropertySet":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Transform":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Layout":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Motion":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVarG.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVarG == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.a.d(context, xmlResourceParser, aVarG.g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f.put(Integer.valueOf(aVarG.a), aVarG);
                        aVarG = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
