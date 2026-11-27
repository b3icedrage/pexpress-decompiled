package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.jivosite.sdk.model.pojo.push.Notification;
import com.jivosite.sdk.ui.chat.JivoChatActivity;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6626sk0<P> implements InterfaceC3851fl1 {

    @NotNull
    public final C6102qE1 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final KW1 c;

    /* JADX INFO: renamed from: sk0$a */
    public static final class a extends ML0 implements Function0<Unit> {
        public final /* synthetic */ AbstractC6626sk0<P> d;
        public final /* synthetic */ C3641el1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC6626sk0<P> abstractC6626sk0, C3641el1 c3641el1) {
            super(0);
            this.d = abstractC6626sk0;
            this.e = c3641el1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.d.c(this.e);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: sk0$b */
    public static final class b extends ML0 implements Function0<B61> {
        public final /* synthetic */ AbstractC6626sk0<P> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC6626sk0<P> abstractC6626sk0) {
            super(0);
            this.d = abstractC6626sk0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B61 invoke() {
            B61 b61 = new B61(this.d.a.a);
            Intrinsics.checkNotNullExpressionValue(b61, "from(context.appContext)");
            return b61;
        }
    }

    public AbstractC6626sk0(@NotNull C6102qE1 context, @NotNull InterfaceC5889pD1 schedulers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = context;
        this.b = schedulers;
        this.c = XO0.b(new b(this));
    }

    @Override // defpackage.InterfaceC3851fl1
    public final void a(@NotNull C3641el1 data) {
        NotificationChannel notificationChannelI;
        Intrinsics.checkNotNullParameter(data, "data");
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            c(data);
            return;
        }
        a aVar = new a(this, data);
        B61 b61 = (B61) this.c.getValue();
        if (i >= 26) {
            notificationChannelI = B61.b.i(b61.b, "jivo_sdk_message");
        } else {
            b61.getClass();
            notificationChannelI = null;
        }
        if (notificationChannelI != null) {
            aVar.invoke();
        } else {
            this.b.c().execute(new O8(2, this, aVar));
        }
    }

    public abstract void b();

    public final void c(C3641el1 data) {
        PendingIntent activity;
        Intrinsics.checkNotNullParameter(data, "data");
        Notification notification = data.b;
        String str = notification.b.get(0);
        String str2 = notification.b.get(1);
        C3172cY1 args = new C3172cY1(str, str2);
        Intrinsics.checkNotNullParameter(args, "args");
        C6102qE1 c6102qE1 = ((C3382dY1) this).a;
        String string = c6102qE1.a.getString(R.string.notification_message_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.appContext.getSt…tification_message_title)");
        Context context = c6102qE1.a;
        String string2 = context.getString(R.string.notification_message_text_format, str, str2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.appContext.getSt… args.name, args.message)");
        C4133h61 c4133h61 = new C4133h61(context, "jivo_sdk_message");
        C6104qF0.i.getClass();
        c4133h61.z.icon = 2131231348;
        C6104qF0.i.getClass();
        c4133h61.u = C6333rM.getColor(context, R.color.darkPastelGreen);
        c4133h61.g(16, true);
        Intrinsics.checkNotNullExpressionValue(c4133h61, "Builder(context.appConte…     .setAutoCancel(true)");
        c4133h61.e = C4133h61.c(string);
        c4133h61.f = C4133h61.c(string2);
        R4 r4 = C6104qF0.i.b;
        if (r4 == null || (activity = (PendingIntent) r4.invoke()) == null) {
            activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) JivoChatActivity.class), 167772160);
            Intrinsics.checkNotNullExpressionValue(activity, "Intent(\n            cont…E\n            )\n        }");
        }
        c4133h61.g = activity;
        if (Build.VERSION.SDK_INT < 26) {
            C6104qF0.i.getClass();
            c4133h61.j(Uri.parse("android.resource://" + context.getPackageName() + "/2131886082"));
        }
        android.app.Notification notificationB = c4133h61.b();
        Intrinsics.checkNotNullExpressionValue(notificationB, "getDefaultNotificationBu…   }\n            .build()");
        ((B61) this.c.getValue()).a(1, notificationB);
    }
}
