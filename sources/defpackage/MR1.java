package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class MR1 extends AbstractC5982pg1<EnumC2644a42, Integer> {

    @NotNull
    public final InterfaceC1442Lg1 b;

    @NotNull
    public final InterfaceC0565Aa0 c;

    @NotNull
    public final KW1 d;

    public static final class a implements InterfaceC6396rf0<EnumC2644a42> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: MR1$a$a, reason: collision with other inner class name */
        public static final class C0095a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: MR1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.trading.usecases.StrategySelectionUseCaseApi$value_delegate$lambda$2$$inlined$map$1$2", f = "StrategySelectionUseCaseApi.kt", l = {219}, m = "emit")
            public static final class C0096a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0096a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0095a.this.a(null, this);
                }
            }

            public C0095a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0096a c0096a;
                Object next;
                if (jm instanceof C0096a) {
                    c0096a = (C0096a) jm;
                    int i = c0096a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0096a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0096a = new C0096a(jm);
                    }
                } else {
                    c0096a = new C0096a(jm);
                }
                Object obj2 = c0096a.d;
                MN mn = MN.d;
                int i2 = c0096a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Integer num = (Integer) obj;
                    C4814k70 c4814k70 = EnumC2644a42.m;
                    c4814k70.getClass();
                    AbstractC5838p0.b bVar = new AbstractC5838p0.b();
                    while (true) {
                        if (!bVar.hasNext()) {
                            next = null;
                            break;
                        }
                        next = bVar.next();
                        int i3 = ((EnumC2644a42) next).d;
                        if (num != null && i3 == num.intValue()) {
                            break;
                        }
                    }
                    EnumC2644a42 enumC2644a42 = (EnumC2644a42) next;
                    if (enumC2644a42 == null) {
                        enumC2644a42 = EnumC2644a42.i;
                    }
                    c0096a.e = 1;
                    if (this.d.a(enumC2644a42, c0096a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super EnumC2644a42> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0095a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MR1(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.b = preferencesRepository;
        this.c = experimentsProviderApi;
        this.d = XO0.b(new C3410dg(this, 2));
    }

    @NotNull
    public final InterfaceC6396rf0<EnumC2644a42> k() {
        return (InterfaceC6396rf0) this.d.getValue();
    }
}
