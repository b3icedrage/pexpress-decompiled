package defpackage;

import android.content.Context;
import androidx.work.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LI71;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "initializeWorkManager", "(Landroid/content/Context;)V", "Lik2;", "getInstance", "(Landroid/content/Context;)Lik2;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class I71 {

    @NotNull
    public static final I71 INSTANCE = new I71();

    private I71() {
    }

    private final void initializeWorkManager(Context context) {
        a aVar;
        try {
            Object applicationContext = context.getApplicationContext();
            a.b bVar = applicationContext instanceof a.b ? (a.b) applicationContext : null;
            if (bVar == null || (aVar = bVar.a()) == null) {
                aVar = new a(new a.C0241a());
            }
            Intrinsics.checkNotNullExpressionValue(aVar, "(context.applicationCont…uration.Builder().build()");
            C4736jk2.c(context, aVar);
        } catch (IllegalStateException e) {
            NS0.error("OSWorkManagerHelper initializing WorkManager failed: ", e);
        }
    }

    @NotNull
    public final synchronized AbstractC4477ik2 getInstance(@NotNull Context context) {
        C4736jk2 c4736jk2B;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                c4736jk2B = C4736jk2.b(context);
                Intrinsics.checkNotNullExpressionValue(c4736jk2B, "{\n            WorkManage…stance(context)\n        }");
            } catch (IllegalStateException e) {
                NS0.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e);
                initializeWorkManager(context);
                c4736jk2B = C4736jk2.b(context);
                Intrinsics.checkNotNullExpressionValue(c4736jk2B, "{\n            /*\n       …stance(context)\n        }");
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4736jk2B;
    }
}
