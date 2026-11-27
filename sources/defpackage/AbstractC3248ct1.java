package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ct1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3248ct1 {

    @NotNull
    public static final AbstractC3248ct1 a;

    /* JADX INFO: renamed from: ct1$a */
    public static final class a extends AbstractC3248ct1 {
    }

    /* JADX INFO: renamed from: ct1$b */
    public static final class b extends AbstractC3248ct1 {

        @NotNull
        public final PackageManager.ResolveInfoFlags b;

        public b(@NotNull PackageManager.ResolveInfoFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.b = value;
        }
    }

    static {
        AbstractC3248ct1 aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(0);
            Intrinsics.checkNotNullExpressionValue(resolveInfoFlagsOf, "of(...)");
            aVar = new b(resolveInfoFlagsOf);
        } else {
            aVar = new a();
        }
        a = aVar;
    }
}
