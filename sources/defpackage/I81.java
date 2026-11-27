package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class I81 implements InterfaceC2586Zn0 {
    public final /* synthetic */ C2813ao0 c;

    public I81(C2813ao0 c2813ao0) {
        this.c = c2813ao0;
    }

    @Override // defpackage.InterfaceC7404wS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        return this.c.e().entrySet();
    }

    @Override // defpackage.InterfaceC7404wS1
    public final void b(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        C7824yS1 body = (C7824yS1) function2;
        Intrinsics.checkNotNullParameter(body, "body");
        InterfaceC7404wS1.a.a(this, body);
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC7404wS1
    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listH = this.c.h(name);
        if (listH.isEmpty()) {
            listH = null;
        }
        if (listH != null) {
            return (String) CollectionsKt.firstOrNull(listH);
        }
        return null;
    }
}
