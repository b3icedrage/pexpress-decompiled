package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class I5 extends C7576xG {

    @NotNull
    public final U5 d;

    @NotNull
    public final InterfaceC7748y5 e;

    @NotNull
    public final InterfaceC5862p6 f;

    @NotNull
    public final a g;

    public static final class a implements InterfaceC6396rf0<C1643Nv> {
        public final /* synthetic */ FP1 d;

        /* JADX INFO: renamed from: I5$a$a, reason: collision with other inner class name */
        public static final class C0047a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: I5$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.activation.screens.action_button.ActivationActionButtonViewModelBase$special$$inlined$map$1$2", f = "ActivationActionButtonViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0048a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0048a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0047a.this.a(null, this);
                }
            }

            public C0047a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0048a c0048a;
                if (jm instanceof C0048a) {
                    c0048a = (C0048a) jm;
                    int i = c0048a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0048a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0048a = new C0048a(jm);
                    }
                } else {
                    c0048a = new C0048a(jm);
                }
                Object obj2 = c0048a.d;
                MN mn = MN.d;
                int i2 = c0048a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C1643Nv c1643Nv = ((AbstractC5652o6) obj) instanceof AbstractC5652o6.c ? new C1643Nv(R.string.create_new_account_button) : new C1643Nv(R.string.deposit_text);
                    c0048a.e = 1;
                    if (this.d.a(c1643Nv, c0048a) == mn) {
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
        public final Object c(@NotNull InterfaceC6606sf0<? super C1643Nv> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0047a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public I5(@NotNull U5 depositCallback, @NotNull InterfaceC7748y5 accountInvalidCallbacks, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(depositCallback, "depositCallback");
        Intrinsics.checkNotNullParameter(accountInvalidCallbacks, "accountInvalidCallbacks");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.d = depositCallback;
        this.e = accountInvalidCallbacks;
        this.f = activationStateProviderApi;
        this.g = new a(activationStateProviderApi.a());
    }
}
