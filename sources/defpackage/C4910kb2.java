package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4910kb2 implements InterfaceC6353rS1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final a b;

    /* JADX INFO: renamed from: kb2$a */
    public static final class a implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: kb2$a$a, reason: collision with other inner class name */
        public static final class C0424a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: kb2$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.data.UserEmailSessionValue$special$$inlined$map$1$2", f = "UserEmailSessionValue.kt", l = {219}, m = "emit")
            public static final class C0425a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0425a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0424a.this.a(null, this);
                }
            }

            public C0424a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0425a c0425a;
                if (jm instanceof C0425a) {
                    c0425a = (C0425a) jm;
                    int i = c0425a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0425a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0425a = new C0425a(jm);
                    }
                } else {
                    c0425a = new C0425a(jm);
                }
                Object obj2 = c0425a.d;
                MN mn = MN.d;
                int i2 = c0425a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    String str = c6945uG != null ? c6945uG.b : null;
                    c0425a.e = 1;
                    if (this.d.a(str, c0425a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0424a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public C4910kb2(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = EnumC2694aJ1.EMAIL_KEY;
        this.b = new a(appData.k);
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) throws Throwable {
        this.b.c(new C4700jb2(ta), dVar);
        return MN.d;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.b;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.a;
    }
}
