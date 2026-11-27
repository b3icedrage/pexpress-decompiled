package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8021zO0 implements Function1 {
    public static final C8021zO0 e = new C8021zO0(0);
    public static final C8021zO0 g = new C8021zO0(1);
    public static final C8021zO0 h = new C8021zO0(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C8021zO0(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC7571xE0 it = (InterfaceC7571xE0) obj;
                int i = FO0.v;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.i());
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List<RI0<? extends Object>> list = C4753jp1.a;
                Intrinsics.checkNotNullParameter(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                return C1526Mj.i(actualTypeArguments);
            default:
                InterfaceC1335Jx selectMostSpecificInEachOverridableGroup = (InterfaceC1335Jx) obj;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
        }
    }
}
