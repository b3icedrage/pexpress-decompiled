package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7184vP1 implements IK1 {

    /* JADX INFO: renamed from: vP1$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super GK1>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1<Integer> g;

        /* JADX INFO: renamed from: vP1$a$a, reason: collision with other inner class name */
        public static final class C0513a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C2512Yo1 d;
            public final /* synthetic */ InterfaceC6606sf0<GK1> e;

            /* JADX INFO: renamed from: vP1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            public static final class C0514a extends LM {
                public /* synthetic */ Object d;
                public final /* synthetic */ C0513a<T> e;
                public int g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0514a(C0513a<? super T> c0513a, JM<? super C0514a> jm) {
                    super(jm);
                    this.e = c0513a;
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.g |= Integer.MIN_VALUE;
                    return this.e.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0513a(C2512Yo1 c2512Yo1, InterfaceC6606sf0<? super GK1> interfaceC6606sf0) {
                this.d = c2512Yo1;
                this.e = interfaceC6606sf0;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final /* bridge */ /* synthetic */ Object a(Object obj, JM jm) {
                return b(((Number) obj).intValue(), jm);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Nullable
            public final Object b(int i, @NotNull JM<? super Unit> jm) {
                C0514a c0514a;
                if (jm instanceof C0514a) {
                    c0514a = (C0514a) jm;
                    int i2 = c0514a.g;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0514a.g = i2 - Integer.MIN_VALUE;
                    } else {
                        c0514a = new C0514a(this, jm);
                    }
                } else {
                    c0514a = new C0514a(this, jm);
                }
                Object obj = c0514a.d;
                MN mn = MN.d;
                int i3 = c0514a.g;
                if (i3 == 0) {
                    C1795Pt1.b(obj);
                    if (i > 0) {
                        C2512Yo1 c2512Yo1 = this.d;
                        if (!c2512Yo1.d) {
                            c2512Yo1.d = true;
                            GK1 gk1 = GK1.d;
                            c0514a.g = 1;
                            if (this.e.a(gk1, c0514a) == mn) {
                                return mn;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1<Integer> fp1, JM<? super a> jm) {
            super(2, jm);
            this.g = fp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            a aVar = new a(this.g, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super GK1> interfaceC6606sf0, JM<? super Unit> jm) {
            ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0513a c0513a = new C0513a(new C2512Yo1(), (InterfaceC6606sf0) this.e);
                this.d = 1;
                if (this.g.c(c0513a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    @Override // defpackage.IK1
    @NotNull
    public final InterfaceC6396rf0<GK1> a(@NotNull FP1<Integer> fp1) {
        return new C3735fC1(new a(fp1, null));
    }

    @NotNull
    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
