package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2331Wp implements InterfaceC6353rS1 {

    @NotNull
    public final EQ a;

    @NotNull
    public final EnumC2694aJ1 b;

    @NotNull
    public final a c;

    /* JADX INFO: renamed from: Wp$a */
    public static final class a implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;
        public final /* synthetic */ C2331Wp e;

        /* JADX INFO: renamed from: Wp$a$a, reason: collision with other inner class name */
        public static final class C0175a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C2331Wp e;

            /* JADX INFO: renamed from: Wp$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.feature.support.chat.BalanceSessionValue$special$$inlined$map$1$2", f = "BalanceSessionValue.kt", l = {220, 219}, m = "emit")
            public static final class C0176a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public InterfaceC6606sf0 g;
                public C6945uG i;

                public C0176a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0175a.this.a(null, this);
                }
            }

            public C0175a(InterfaceC6606sf0 interfaceC6606sf0, C2331Wp c2331Wp) {
                this.d = interfaceC6606sf0;
                this.e = c2331Wp;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
            
                if (r2.a(r9, r0) == r1) goto L29;
             */
            @Override // defpackage.InterfaceC6606sf0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r9, @org.jetbrains.annotations.NotNull defpackage.JM r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof defpackage.C2331Wp.a.C0175a.C0176a
                    if (r0 == 0) goto L13
                    r0 = r10
                    Wp$a$a$a r0 = (defpackage.C2331Wp.a.C0175a.C0176a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    Wp$a$a$a r0 = new Wp$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.d
                    MN r1 = defpackage.MN.d
                    int r2 = r0.e
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L3b
                    if (r2 == r4) goto L33
                    if (r2 != r3) goto L2b
                    defpackage.C1795Pt1.b(r10)
                    goto L81
                L2b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L33:
                    uG r9 = r0.i
                    sf0 r2 = r0.g
                    defpackage.C1795Pt1.b(r10)
                    goto L5a
                L3b:
                    defpackage.C1795Pt1.b(r10)
                    uG r9 = (defpackage.C6945uG) r9
                    Wp r10 = r8.e
                    EQ r10 = r10.a
                    if (r9 == 0) goto L49
                    java.lang.String r2 = r9.e
                    goto L4a
                L49:
                    r2 = r5
                L4a:
                    sf0 r6 = r8.d
                    r0.g = r6
                    r0.i = r9
                    r0.e = r4
                    java.lang.String r10 = r10.c(r2)
                    if (r10 != r1) goto L59
                    goto L80
                L59:
                    r2 = r6
                L5a:
                    if (r9 == 0) goto L64
                    double r6 = r9.j
                    java.lang.Double r9 = new java.lang.Double
                    r9.<init>(r6)
                    goto L65
                L64:
                    r9 = r5
                L65:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r10)
                    r4.append(r9)
                    java.lang.String r9 = r4.toString()
                    r0.g = r5
                    r0.i = r5
                    r0.e = r3
                    java.lang.Object r9 = r2.a(r9, r0)
                    if (r9 != r1) goto L81
                L80:
                    return r1
                L81:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C2331Wp.a.C0175a.a(java.lang.Object, JM):java.lang.Object");
            }
        }

        public a(GP1 gp1, C2331Wp c2331Wp) {
            this.d = gp1;
            this.e = c2331Wp;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0175a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public C2331Wp(@NotNull C4923kf appData, @NotNull EQ currencySignProviderApi) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(currencySignProviderApi, "currencySignProviderApi");
        this.a = currencySignProviderApi;
        this.b = EnumC2694aJ1.USER_BALANCE_KEY;
        this.c = new a(appData.k, this);
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.c;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.b;
    }
}
