package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fi2 implements InterfaceC7206vX {
    public int a;
    public TK b;
    public C6932uB1 c;
    public TK.a d;
    public final C7312w10 e = new C7312w10(this);
    public int f = 0;
    public boolean g = false;
    public final DX h = new DX(this);
    public final DX i = new DX(this);
    public a j = a.d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("NONE", 0);
            d = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a("CENTER", 3);
            e = aVar4;
            g = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    public Fi2(TK tk) {
        this.b = tk;
    }

    public static void b(DX dx, DX dx2, int i) {
        dx.l.add(dx2);
        dx.f = i;
        dx2.k.add(dx);
    }

    public static DX h(IK ik) {
        IK ik2 = ik.f;
        if (ik2 == null) {
            return null;
        }
        TK tk = ik2.d;
        int iOrdinal = ik2.e.ordinal();
        if (iOrdinal == 1) {
            return tk.d.h;
        }
        if (iOrdinal == 2) {
            return tk.e.h;
        }
        if (iOrdinal == 3) {
            return tk.d.i;
        }
        if (iOrdinal == 4) {
            return tk.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return tk.e.k;
    }

    public static DX i(IK ik, int i) {
        IK ik2 = ik.f;
        if (ik2 == null) {
            return null;
        }
        TK tk = ik2.d;
        Fi2 fi2 = i == 0 ? tk.d : tk.e;
        int iOrdinal = ik2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return fi2.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return fi2.i;
        }
        return null;
    }

    public final void c(DX dx, DX dx2, int i, C7312w10 c7312w10) {
        dx.l.add(dx2);
        dx.l.add(this.e);
        dx.h = i;
        dx.i = c7312w10;
        dx2.k.add(dx);
        c7312w10.k.add(dx);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            TK tk = this.b;
            int i3 = tk.v;
            int iMax = Math.max(tk.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            TK tk2 = this.b;
            int i4 = tk2.y;
            int iMax2 = Math.max(tk2.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        C7312w10 c7312w10 = this.e;
        if (c7312w10.j) {
            return c7312w10.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(IK ik, IK ik2, int i) {
        C7312w10 c7312w10;
        float f;
        int i2;
        DX dxH = h(ik);
        DX dxH2 = h(ik2);
        if (dxH.j && dxH2.j) {
            int iE = ik.e() + dxH.g;
            int iE2 = dxH2.g - ik2.e();
            int i3 = iE2 - iE;
            C7312w10 c7312w11 = this.e;
            if (!c7312w11.j) {
                TK.a aVar = this.d;
                TK.a aVar2 = TK.a.g;
                if (aVar == aVar2) {
                    int i4 = this.a;
                    if (i4 == 0) {
                        c7312w11.d(g(i3, i));
                    } else if (i4 == 1) {
                        c7312w11.d(Math.min(g(c7312w11.m, i), i3));
                    } else if (i4 == 2) {
                        TK tk = this.b;
                        TK tk2 = tk.V;
                        if (tk2 != null) {
                            C7312w10 c7312w12 = (i == 0 ? tk2.d : tk2.e).e;
                            if (c7312w12.j) {
                                c7312w11.d(g((int) ((c7312w12.g * (i == 0 ? tk.w : tk.z)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        TK tk3 = this.b;
                        Fi2 fi2 = tk3.d;
                        if (fi2.d == aVar2 && fi2.a == 3) {
                            C6600sd2 c6600sd2 = tk3.e;
                            if (c6600sd2.d != aVar2 || c6600sd2.a != 3) {
                                if (i == 0) {
                                    fi2 = tk3.e;
                                }
                                c7312w10 = fi2.e;
                                if (c7312w10.j) {
                                    f = tk3.Y;
                                    if (i == 1) {
                                        i2 = (int) ((c7312w10.g / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * c7312w10.g) + 0.5f);
                                    }
                                    c7312w11.d(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                fi2 = tk3.e;
                            }
                            c7312w10 = fi2.e;
                            if (c7312w10.j) {
                                f = tk3.Y;
                                if (i == 1) {
                                    i2 = (int) ((c7312w10.g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c7312w10.g) + 0.5f);
                                }
                                c7312w11.d(i2);
                            }
                        }
                    }
                }
            }
            if (c7312w11.j) {
                int i5 = c7312w11.g;
                DX dx = this.i;
                DX dx2 = this.h;
                if (i5 == i3) {
                    dx2.d(iE);
                    dx.d(iE2);
                    return;
                }
                TK tk4 = this.b;
                float f2 = i == 0 ? tk4.f0 : tk4.g0;
                if (dxH == dxH2) {
                    iE = dxH.g;
                    iE2 = dxH2.g;
                    f2 = 0.5f;
                }
                dx2.d((int) ((((iE2 - iE) - i5) * f2) + iE + 0.5f));
                dx.d(dx2.g + c7312w11.g);
            }
        }
    }

    @Override // defpackage.InterfaceC7206vX
    public void a(InterfaceC7206vX interfaceC7206vX) {
    }
}
