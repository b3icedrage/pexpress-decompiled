package defpackage;

import defpackage.C4077gq0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2332Wp0<T extends C4077gq0> {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    @NotNull
    public final LinkedHashMap b = new LinkedHashMap();

    @NotNull
    public final LinkedHashMap c = new LinkedHashMap();

    @NotNull
    public final a d = a.d;
    public boolean e = true;
    public boolean f = true;
    public final boolean g = C1984Se1.a;

    /* JADX INFO: renamed from: Wp0$a */
    public static final class a extends ML0 implements Function1<T, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            Intrinsics.checkNotNullParameter((C4077gq0) obj, "$this$null");
            return Unit.a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: kotlin.jvm.functions.Function1<TBuilder, kotlin.Unit> */
    /* JADX INFO: renamed from: Wp0$b */
    public static final class b extends ML0 implements Function1<Object, Unit> {
        public final /* synthetic */ Function1<Object, Unit> d;
        public final /* synthetic */ Function1<TBuilder, Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: kotlin.jvm.functions.Function1<? super TBuilder, kotlin.Unit> */
        public b(Function1<Object, Unit> function1, Function1<? super TBuilder, Unit> function2) {
            super(1);
            this.d = function1;
            this.e = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$this$null");
            Function1<Object, Unit> function1 = this.d;
            if (function1 != null) {
                function1.invoke(obj);
            }
            this.e.invoke((TBuilder) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: jq0<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: jq0<TBuilder, TPlugin> */
    /* JADX INFO: renamed from: Wp0$c */
    public static final class c extends ML0 implements Function1<C1782Pp0, Unit> {
        public final /* synthetic */ InterfaceC4755jq0<TBuilder, TPlugin> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: jq0<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: jq0<? extends TBuilder, TPlugin> */
        public c(InterfaceC4755jq0<? extends TBuilder, TPlugin> interfaceC4755jq0) {
            super(1);
            this.d = interfaceC4755jq0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C1782Pp0 c1782Pp0) {
            C1782Pp0 scope = c1782Pp0;
            Intrinsics.checkNotNullParameter(scope, "scope");
            InterfaceC2576Zk interfaceC2576Zk = (InterfaceC2576Zk) scope.m.a(C4965kq0.a, C2436Xp0.d);
            LinkedHashMap linkedHashMap = scope.o.b;
            InterfaceC4755jq0<TBuilder, TPlugin> interfaceC4755jq0 = this.d;
            Object obj = linkedHashMap.get(interfaceC4755jq0.getKey());
            Intrinsics.checkNotNull(obj);
            Object objB = interfaceC4755jq0.b((Function1<? super TBuilder, Unit>) ((Function1) obj));
            interfaceC4755jq0.a((TPlugin) objB, scope);
            interfaceC2576Zk.b(interfaceC4755jq0.getKey(), objB);
            return Unit.a;
        }
    }

    public final <TBuilder, TPlugin> void a(@NotNull InterfaceC4755jq0<? extends TBuilder, TPlugin> plugin, @NotNull Function1<? super TBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(plugin.getKey(), new b((Function1) linkedHashMap.get(plugin.getKey()), configure));
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new c(plugin));
    }
}
