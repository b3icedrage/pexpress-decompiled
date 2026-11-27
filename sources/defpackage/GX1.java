package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class GX1 {

    @NotNull
    public final InterfaceC0565Aa0 a;

    @NotNull
    public final HX1 b;

    @NotNull
    public final InterfaceC6396rf0<Boolean> c;

    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ GX1 e;

        /* JADX INFO: renamed from: GX1$a$a, reason: collision with other inner class name */
        public static final class C0036a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ GX1 e;

            /* JADX INFO: renamed from: GX1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.experiments.remote.telemetry.TelemetryEnabledExperimentProviderApi$special$$inlined$map$1$2", f = "TelemetryEnabledExperimentProviderApi.kt", l = {219}, m = "emit")
            public static final class C0037a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0037a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0036a.this.a(null, this);
                }
            }

            public C0036a(InterfaceC6606sf0 interfaceC6606sf0, GX1 gx1) {
                this.d = interfaceC6606sf0;
                this.e = gx1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0037a c0037a;
                if (jm instanceof C0037a) {
                    c0037a = (C0037a) jm;
                    int i = c0037a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0037a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0037a = new C0037a(jm);
                    }
                } else {
                    c0037a = new C0037a(jm);
                }
                Object obj2 = c0037a.d;
                MN mn = MN.d;
                int i2 = c0037a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    AbstractC7427wa0 abstractC7427wa0 = (AbstractC7427wa0) obj;
                    Boolean boolValueOf = Boolean.valueOf(abstractC7427wa0 instanceof AbstractC7427wa0.a ? ((AbstractC7427wa0.a) abstractC7427wa0).b : this.e.b.o());
                    c0037a.e = 1;
                    if (this.d.a(boolValueOf, c0037a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0, GX1 gx1) {
            this.d = interfaceC6396rf0;
            this.e = gx1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0036a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public GX1(@NotNull InterfaceC0565Aa0 experimentsProviderApi, @NotNull HX1 localExperiment) {
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(localExperiment, "localExperiment");
        this.a = experimentsProviderApi;
        this.b = localExperiment;
        this.c = C4466ii.m(new a(experimentsProviderApi.a(EnumC7637xa0.TELEMETRY_ENABLED), this));
    }
}
