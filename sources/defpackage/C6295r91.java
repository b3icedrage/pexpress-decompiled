package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6295r91 {
    public final int a;
    public final ConcurrentHashMap.KeySetView<String, Boolean> b;

    public /* synthetic */ C6295r91() {
        this(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final boolean a(@NotNull String key) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.a == Integer.MAX_VALUE) {
            return this.b.add(key);
        }
        ConcurrentHashMap.KeySetView<String, Boolean> seen = this.b;
        Intrinsics.checkNotNullExpressionValue(seen, "seen");
        synchronized (seen) {
            z = this.b.size() < this.a && this.b.add(key);
        }
        return z;
    }

    public C6295r91(int i) {
        this.a = i;
        this.b = ConcurrentHashMap.newKeySet();
    }
}
