package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2869b5 implements ZI1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final a b;

    /* JADX INFO: renamed from: b5$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: b5$a$a, reason: collision with other inner class name */
        public static final class C0247a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: b5$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.data.AccountVerificationSessionValue$special$$inlined$map$1$2", f = "AccountVerificationSessionValue.kt", l = {219}, m = "emit")
            public static final class C0248a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0248a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0247a.this.a(null, this);
                }
            }

            public C0247a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0248a c0248a;
                if (jm instanceof C0248a) {
                    c0248a = (C0248a) jm;
                    int i = c0248a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0248a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0248a = new C0248a(jm);
                    }
                } else {
                    c0248a = new C0248a(jm);
                }
                Object obj2 = c0248a.d;
                MN mn = MN.d;
                int i2 = c0248a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    Boolean boolValueOf = c6945uG != null ? Boolean.valueOf(c6945uG.o) : null;
                    c0248a.e = 1;
                    if (this.d.a(boolValueOf, c0248a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0247a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public C2869b5(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = EnumC2694aJ1.VERIFIED;
        this.b = new a(appData.k);
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) throws Throwable {
        Object objC = ((a) b()).c(new YI1(ta, this), dVar);
        MN mn = MN.d;
        return objC;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<Boolean> b() {
        return this.b;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.a;
    }
}
