package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.pexpress.tool.R;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P8 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ P8(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                S8 this$0 = (S8) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C7129v8 agent = (C7129v8) this.g;
                Intrinsics.checkNotNullParameter(agent, "$agent");
                this$0.g.p().c(new XT(Long.parseLong(agent.a), agent.c, agent.d, agent.e));
                break;
            case 1:
                AbstractC6626sk0 this$1 = (AbstractC6626sk0) this.e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                AbstractC6626sk0.a doAfter = (AbstractC6626sk0.a) this.g;
                Intrinsics.checkNotNullParameter(doAfter, "$doAfter");
                C3382dY1 c3382dY1 = (C3382dY1) this$1;
                C6102qE1 c6102qE1 = c3382dY1.a;
                String string = c6102qE1.a.getString(R.string.notification_channel_message_name);
                Intrinsics.checkNotNullExpressionValue(string, "context.appContext.getSt…ion_channel_message_name)");
                Context context = c6102qE1.a;
                String string2 = context.getString(R.string.notification_channel_message_description);
                Intrinsics.checkNotNullExpressionValue(string2, "context.appContext.getSt…nnel_message_description)");
                C7282vs.b();
                NotificationChannel notificationChannelA = C6480s30.a(string);
                notificationChannelA.setDescription(string2);
                C6104qF0.i.getClass();
                Uri uriB = FileProvider.c(context, context.getPackageName() + ".jivosdk.fileprovider").b(new File(new File(context.getFilesDir(), "notifications"), "Jivo - Magic.mp3"));
                Intrinsics.checkNotNullExpressionValue(uriB, "getUriForFile(context.ap…sdk.fileprovider\", sound)");
                notificationChannelA.setSound(uriB, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
                B61 b61 = (B61) c3382dY1.c.getValue();
                if (Build.VERSION.SDK_INT >= 26) {
                    B61.b.a(b61.b, notificationChannelA);
                } else {
                    b61.getClass();
                }
                doAfter.invoke();
                break;
            default:
                ZY0 zy0 = (ZY0) this.e;
                C6589sb c6589sbB = zy0.b((QZ1) this.g);
                if (c6589sbB != null) {
                    zy0.b.add(c6589sbB);
                }
                break;
        }
    }
}
