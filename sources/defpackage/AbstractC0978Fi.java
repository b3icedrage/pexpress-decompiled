package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978Fi {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: Fi$a */
    public static final class a extends AbstractC0978Fi {
        public final int b;

        public a(int i) {
            this.b = i;
        }
    }

    /* JADX INFO: renamed from: Fi$b */
    public static final class b extends AbstractC0978Fi {

        @NotNull
        public final PackageManager.ApplicationInfoFlags b;

        public b(@NotNull PackageManager.ApplicationInfoFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.b = value;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 33) {
            new a(0);
            return;
        }
        PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(0);
        Intrinsics.checkNotNullExpressionValue(applicationInfoFlagsOf, "of(...)");
        new b(applicationInfoFlagsOf);
    }
}
