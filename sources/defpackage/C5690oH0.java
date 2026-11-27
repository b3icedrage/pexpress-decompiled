package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5690oH0 {
    public final ArrayList<c> a = new ArrayList<>();

    /* JADX INFO: renamed from: oH0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: oH0$b */
    public interface b {
        @Nullable
        Object a();
    }

    /* JADX INFO: renamed from: oH0$c */
    public interface c {
        @NotNull
        Object getValue();
    }

    /* JADX INFO: renamed from: oH0$d */
    public static final class d implements c {
        public final ArrayList<Object> a = new ArrayList<>();

        @Override // defpackage.C5690oH0.c
        @NotNull
        public final Object getValue() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: oH0$e */
    public static final class e implements c {
        public final HashMap<String, Object> a = new HashMap<>();

        @Override // defpackage.C5690oH0.c
        @NotNull
        public final Object getValue() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: oH0$f */
    public static final class f implements c {
        public final String a;

        public f(@NotNull String str) {
            this.a = str;
        }

        @Override // defpackage.C5690oH0.c
        @NotNull
        public final Object getValue() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: oH0$g */
    public static final class g implements c {
        public final Object a;

        public g(@NotNull Object obj) {
            this.a = obj;
        }

        @Override // defpackage.C5690oH0.c
        @NotNull
        public final Object getValue() {
            return this.a;
        }
    }

    @Nullable
    public final c a() {
        ArrayList<c> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (c) C1742Pc.c(1, arrayList);
    }

    public final boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        c cVarA = a();
        e();
        if (!(a() instanceof f)) {
            if (!(a() instanceof d)) {
                return false;
            }
            d dVar = (d) a();
            if (cVarA == null || dVar == null) {
                return false;
            }
            dVar.a.add(cVarA.getValue());
            return false;
        }
        f fVar = (f) a();
        e();
        e eVar = (e) a();
        if (fVar == null || cVarA == null || eVar == null) {
            return false;
        }
        eVar.a.put(fVar.a, cVarA.getValue());
        return false;
    }

    public final boolean c(b bVar) {
        Object objA = bVar.a();
        if (a() == null && objA != null) {
            this.a.add(new g(objA));
            return true;
        }
        if (a() instanceof f) {
            f fVar = (f) a();
            e();
            ((e) a()).a.put(fVar.a, objA);
            return false;
        }
        if (!(a() instanceof d)) {
            return false;
        }
        ((d) a()).a.add(objA);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d(@NotNull final C5900pH0 c5900pH0) throws IOException {
        boolean zB;
        int i = a.a[c5900pH0.d.peek().ordinal()];
        ArrayList<c> arrayList = this.a;
        io.sentry.vendor.gson.stream.a aVar = c5900pH0.d;
        switch (i) {
            case 1:
                c5900pH0.l1();
                arrayList.add(new d());
                zB = false;
                break;
            case 2:
                c5900pH0.h1();
                zB = b();
                break;
            case 3:
                c5900pH0.X0();
                arrayList.add(new e());
                zB = false;
                break;
            case 4:
                c5900pH0.B0();
                zB = b();
                break;
            case 5:
                arrayList.add(new f(aVar.x0()));
                zB = false;
                break;
            case 6:
                zB = c(new C6634sm0(c5900pH0, 2));
                break;
            case 7:
                zB = c(new b() { // from class: mH0
                    @Override // defpackage.C5690oH0.b
                    public final Object a() {
                        C5900pH0 c5900pH1 = c5900pH0;
                        this.d.getClass();
                        try {
                            try {
                                return Integer.valueOf(c5900pH1.d.E0());
                            } catch (Exception unused) {
                                return Long.valueOf(c5900pH1.d.a1());
                            }
                        } catch (Exception unused2) {
                            return Double.valueOf(c5900pH1.d.d0());
                        }
                    }
                });
                break;
            case 8:
                zB = c(new C5480nH0(c5900pH0));
                break;
            case 9:
                aVar.t();
                zB = c(new C2756ad0());
                break;
            case 10:
                zB = true;
                break;
            default:
                zB = false;
                break;
        }
        if (zB) {
            return;
        }
        d(c5900pH0);
    }

    public final void e() {
        ArrayList<c> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
