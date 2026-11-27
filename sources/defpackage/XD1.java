package defpackage;

import com.api.core.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class XD1 implements YD1 {

    @NotNull
    public final Map<Class<? extends BaseFragment>, InterfaceC1531Mk1<BaseFragment>> a;

    @NotNull
    public final LinkedHashMap b;

    public XD1(@NotNull Map<Class<? extends BaseFragment>, InterfaceC1531Mk1<BaseFragment>> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.a = providers;
        new LinkedHashMap();
        this.b = new LinkedHashMap();
    }
}
