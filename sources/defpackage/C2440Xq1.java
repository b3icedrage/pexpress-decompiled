package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2440Xq1 implements ZI1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final a b;

    /* JADX INFO: renamed from: Xq1$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ FP1 d;

        /* JADX INFO: renamed from: Xq1$a$a, reason: collision with other inner class name */
        public static final class C0196a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Xq1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.data.RegistrationSessionValue$special$$inlined$map$1$2", f = "RegistrationSessionValue.kt", l = {219}, m = "emit")
            public static final class C0197a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0197a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0196a.this.a(null, this);
                }
            }

            public C0196a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0197a c0197a;
                if (jm instanceof C0197a) {
                    c0197a = (C0197a) jm;
                    int i = c0197a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0197a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0197a = new C0197a(jm);
                    }
                } else {
                    c0197a = new C0197a(jm);
                }
                Object obj2 = c0197a.d;
                MN mn = MN.d;
                int i2 = c0197a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!(((AbstractC5652o6) obj) instanceof AbstractC5652o6.c));
                    c0197a.e = 1;
                    if (this.d.a(boolValueOf, c0197a) == mn) {
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

        public a(FP1 fp1) {
            this.d = fp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0196a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C2440Xq1(@NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.a = EnumC2694aJ1.REG_KEY;
        this.b = new a(activationStateProviderApi.a());
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        Object objC = ((a) b()).c(new YI1(ta, this), dVar);
        MN mn = MN.d;
        if (objC != mn) {
            objC = Unit.a;
        }
        return objC == mn ? objC : Unit.a;
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
