package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VT1 extends UT1 {

    @NotNull
    public final GT1 d;

    @NotNull
    public final a e;

    public static final class a implements InterfaceC6396rf0<JT1> {
        public final /* synthetic */ FP1 d;
        public final /* synthetic */ KT1 e;

        /* JADX INFO: renamed from: VT1$a$a, reason: collision with other inner class name */
        public static final class C0158a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ KT1 e;

            /* JADX INFO: renamed from: VT1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.stub.screens.stub_results.StubResultsViewModelBase$special$$inlined$map$1$2", f = "StubResultsViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0159a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0159a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0158a.this.a(null, this);
                }
            }

            public C0158a(InterfaceC6606sf0 interfaceC6606sf0, KT1 kt1) {
                this.d = interfaceC6606sf0;
                this.e = kt1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0159a c0159a;
                if (jm instanceof C0159a) {
                    c0159a = (C0159a) jm;
                    int i = c0159a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0159a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0159a = new C0159a(jm);
                    }
                } else {
                    c0159a = new C0159a(jm);
                }
                Object obj2 = c0159a.d;
                MN mn = MN.d;
                int i2 = c0159a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    JT1 jt1A = this.e.a((TT1) obj);
                    c0159a.e = 1;
                    if (this.d.a(jt1A, c0159a) == mn) {
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

        public a(FP1 fp1, KT1 kt1) {
            this.d = fp1;
            this.e = kt1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super JT1> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0158a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public VT1(@NotNull GT1 callback, @NotNull QT1 stubResultsProvider, @NotNull KT1 stubResultsDataProvider) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(stubResultsProvider, "stubResultsProvider");
        Intrinsics.checkNotNullParameter(stubResultsDataProvider, "stubResultsDataProvider");
        this.d = callback;
        this.e = new a(stubResultsProvider.a(), stubResultsDataProvider);
    }
}
