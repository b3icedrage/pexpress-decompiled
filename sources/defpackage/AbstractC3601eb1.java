package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3601eb1 {

    @NotNull
    public static final AbstractC3601eb1 a;

    /* JADX INFO: renamed from: eb1$a */
    public static final class a extends AbstractC3601eb1 {
    }

    /* JADX INFO: renamed from: eb1$b */
    public static final class b extends AbstractC3601eb1 {

        @NotNull
        public final PackageManager.PackageInfoFlags b;

        public b(@NotNull PackageManager.PackageInfoFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.b = value;
        }
    }

    static {
        AbstractC3601eb1 aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0);
            Intrinsics.checkNotNullExpressionValue(packageInfoFlagsOf, "of(...)");
            aVar = new b(packageInfoFlagsOf);
        } else {
            aVar = new a();
        }
        a = aVar;
    }
}
