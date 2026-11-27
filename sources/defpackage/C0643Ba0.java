package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643Ba0 implements InterfaceC0565Aa0 {

    @NotNull
    public final ConcurrentHashMap<String, AbstractC7427wa0> a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: Ba0$a */
    public static final class a implements InterfaceC6396rf0<Map<String, ? extends AbstractC7427wa0>> {
        public final /* synthetic */ C6120qK1 d;
        public final /* synthetic */ C0643Ba0 e;

        /* JADX INFO: renamed from: Ba0$a$a, reason: collision with other inner class name */
        public static final class C0005a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C0643Ba0 e;

            /* JADX INFO: renamed from: Ba0$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.experiments.provider.ExperimentsProviderBase$special$$inlined$map$1$2", f = "ExperimentsProviderBase.kt", l = {219}, m = "emit")
            public static final class C0006a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0006a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0005a.this.a(null, this);
                }
            }

            public C0005a(InterfaceC6606sf0 interfaceC6606sf0, C0643Ba0 c0643Ba0) {
                this.d = interfaceC6606sf0;
                this.e = c0643Ba0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0006a c0006a;
                if (jm instanceof C0006a) {
                    c0006a = (C0006a) jm;
                    int i = c0006a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0006a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0006a = new C0006a(jm);
                    }
                } else {
                    c0006a = new C0006a(jm);
                }
                Object obj2 = c0006a.d;
                MN mn = MN.d;
                int i2 = c0006a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    ConcurrentHashMap<String, AbstractC7427wa0> concurrentHashMap = this.e.a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, AbstractC7427wa0> entry : concurrentHashMap.entrySet()) {
                        AbstractC7427wa0 value = entry.getValue();
                        if ((value instanceof AbstractC7427wa0.a) || Intrinsics.a(value, AbstractC7427wa0.b.a)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    c0006a.e = 1;
                    if (this.d.a(linkedHashMap, c0006a) == mn) {
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

        public a(C6120qK1 c6120qK1, C0643Ba0 c0643Ba0) {
            this.d = c6120qK1;
            this.e = c0643Ba0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Map<String, ? extends AbstractC7427wa0>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0005a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public C0643Ba0() {
        new a(C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d), this);
    }

    @Override // defpackage.InterfaceC0565Aa0
    @NotNull
    public final C0658Bf0 a(@NotNull EnumC7637xa0 step) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new C0658Bf0(AbstractC7427wa0.b.a);
    }

    @Override // defpackage.InterfaceC0565Aa0
    public final void b(@NotNull EnumC7637xa0 experimentType, @NotNull AbstractC7427wa0 experimentResult) {
        Intrinsics.checkNotNullParameter(experimentType, "experimentType");
        Intrinsics.checkNotNullParameter(experimentResult, "experimentResult");
    }

    @Override // defpackage.InterfaceC0565Aa0
    @Nullable
    public final AbstractC7427wa0.b c() {
        return AbstractC7427wa0.b.a;
    }
}
