package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.bumptech.glide.a;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2119Tx1 implements InterfaceC0859Du0 {

    @NotNull
    public final Context a;

    @NotNull
    public final FV0 b;
    public boolean c;

    @Nullable
    public AbstractServiceC7597xN d;

    @Nullable
    public C4133h61 e;

    @Nullable
    public NotificationManager f;

    public C2119Tx1(@NotNull Context context, @NotNull FV0 mainActivityProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainActivityProvider, "mainActivityProvider");
        this.a = context;
        this.b = mainActivityProvider;
    }

    public static Bitmap r(Drawable drawable, int i, int i2) {
        C5651o52 c5651o52;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = i;
        float intrinsicWidth = f / drawable.getIntrinsicWidth();
        float f2 = i2;
        float intrinsicHeight = f2 / drawable.getIntrinsicHeight();
        Float fValueOf = Float.valueOf(0.0f);
        if (intrinsicWidth < intrinsicHeight) {
            c5651o52 = new C5651o52(Float.valueOf(intrinsicWidth), fValueOf, Float.valueOf((f2 - (drawable.getIntrinsicHeight() * intrinsicWidth)) / 2.0f));
        } else {
            c5651o52 = new C5651o52(Float.valueOf(intrinsicWidth), Float.valueOf((f - (drawable.getIntrinsicWidth() * intrinsicHeight)) / 2.0f), fValueOf);
        }
        float fFloatValue = ((Number) c5651o52.d).floatValue();
        float fFloatValue2 = ((Number) c5651o52.e).floatValue();
        float fFloatValue3 = ((Number) c5651o52.g).floatValue();
        Matrix matrix = new Matrix();
        matrix.postTranslate(fFloatValue2, fFloatValue3);
        matrix.postScale(fFloatValue, fFloatValue);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        canvas.drawBitmap(H30.a(drawable), matrix, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap s(PictureDrawable pictureDrawable, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (pictureDrawable.getPicture().getWidth() != i || pictureDrawable.getPicture().getHeight() != i2) {
            canvas.scale(i / pictureDrawable.getPicture().getWidth(), i2 / pictureDrawable.getPicture().getHeight());
        }
        canvas.drawPicture(pictureDrawable.getPicture());
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void a(@Nullable AbstractServiceC7597xN abstractServiceC7597xN) {
        this.d = abstractServiceC7597xN;
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void b() {
        AbstractServiceC7597xN abstractServiceC7597xN = this.d;
        if (abstractServiceC7597xN != null) {
            C5484nI1.a(abstractServiceC7597xN, 1);
        }
        NotificationManager notificationManager = this.f;
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void c(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final Integer num) {
        o(this.a, "Bet has been made", false, new Function1() { // from class: Px1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str4 = str;
                if (str4 != null) {
                    it.e(str4);
                }
                String str5 = str2;
                if (str5 != null) {
                    it.d(str5);
                }
                String str6 = str3;
                C2119Tx1 c2119Tx1 = this;
                if (str6 != null) {
                    it.h(c2119Tx1.q(str6));
                }
                Integer num2 = num;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    c2119Tx1.getClass();
                    if (it != null) {
                        it.i(100, false, iIntValue);
                    }
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void d(@NotNull String iconUrl) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        o(this.a, "Preparing make a bet", false, new C4211hV0(1, this, iconUrl));
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void e() {
        o(this.a, "Searching signals", false, new C1519Mg1(this, 1));
    }

    @Override // defpackage.InterfaceC0859Du0
    @Nullable
    public final Service f() {
        return this.d;
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void g(boolean z) {
        this.c = z;
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void h() {
        if (this.c) {
            return;
        }
        o(this.a, "Connected to server success", false, new C4123h4(this, 2));
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void i(@NotNull final String profit, @NotNull final String endBalance) {
        Intrinsics.checkNotNullParameter(profit, "profit");
        Intrinsics.checkNotNullParameter(endBalance, "endBalance");
        o(this.a, "Win", true, new Function1() { // from class: Rx1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = this.d;
                StringBuilder sbB = K1.b(c2119Tx1.a.getString(R.string.bot_settings_limit_profit), " ");
                sbB.append(profit);
                it.e(sbB.toString());
                Object[] objArr = {endBalance};
                Context context = c2119Tx1.a;
                it.d(context.getString(R.string.you_have_earned_text, objArr) + ". " + context.getString(R.string.robot_was_stopped_title_text));
                it.h = null;
                it.i(0, false, 0);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void j() {
        o(this.a, "Error on platform", false, new C4249hg(this, 1));
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void k() {
        if (this.c) {
            return;
        }
        o(this.a, "Connecting to server in progress", false, new Function1() { // from class: Sx1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.e(this.d.a.getString(R.string.loading_third_step));
                it.d("");
                it.h = null;
                it.i(100, true, 0);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void l() {
        o(this.a, "Connected to server unsuccess", false, new C3767fN0(this, 2));
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void m(@Nullable Service service) {
        String str;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 26) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            C7282vs.b();
            NotificationChannel notificationChannelD = BV.d(packageName);
            notificationChannelD.setLockscreenVisibility(0);
            Object systemService = C6333rM.getSystemService(context, NotificationManager.class);
            if (systemService == null) {
                throw new IllegalStateException("The class is not a supported system service.");
            }
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelD);
            str = "bot.trading.112233";
        } else {
            str = "";
        }
        C4133h61 c4133h61 = new C4133h61(context, str);
        c4133h61.g = p(context, "Default notification");
        c4133h61.g(2, true);
        c4133h61.z.icon = R.drawable.ic_notification;
        c4133h61.u = C6333rM.getColor(context, R.color.notificationIconColor);
        c4133h61.e = C4133h61.c(context.getString(R.string.app_running_in_foreground, context.getString(R.string.app_name)));
        c4133h61.f = C4133h61.c(context.getString(R.string.press_for_get_more_info));
        c4133h61.j = -2;
        c4133h61.s = "service";
        Notification notificationB = c4133h61.b();
        Intrinsics.checkNotNullExpressionValue(notificationB, "build(...)");
        if (service != null) {
            try {
                service.startForeground(112233, notificationB);
            } catch (Exception e) {
                NotificationManager notificationManager = this.f;
                if (notificationManager != null) {
                    notificationManager.notify(112233, notificationB);
                }
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.InterfaceC0859Du0
    public final void n(@NotNull final String loss, @NotNull final String endBalance) {
        Intrinsics.checkNotNullParameter(loss, "loss");
        Intrinsics.checkNotNullParameter(endBalance, "endBalance");
        o(this.a, "Loss", true, new Function1() { // from class: Qx1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = this.d;
                StringBuilder sbB = K1.b(c2119Tx1.a.getString(R.string.bot_settings_limit_loss_title), " ");
                sbB.append(loss);
                it.e(sbB.toString());
                Object[] objArr = {endBalance};
                Context context = c2119Tx1.a;
                it.d(context.getString(R.string.notification_loss_limit_text, objArr) + " " + context.getString(R.string.robot_was_stopped_title_text));
                it.h = null;
                it.i(0, false, 0);
                return Unit.a;
            }
        });
    }

    public final void o(Context context, String str, boolean z, Function1<? super C4133h61, Unit> function1) {
        if (this.e == null) {
            Object systemService = C6333rM.getSystemService(context, NotificationManager.class);
            if (systemService == null) {
                throw new IllegalStateException("The class is not a supported system service.");
            }
            this.f = (NotificationManager) systemService;
            this.e = new C4133h61(context, "bot.trading.112233");
        }
        C4133h61 c4133h61 = this.e;
        Intrinsics.checkNotNull(c4133h61);
        if (z) {
            c4133h61.j(Settings.System.DEFAULT_NOTIFICATION_URI);
        } else {
            c4133h61.j(null);
        }
        c4133h61.u = C6333rM.getColor(context, R.color.notificationIconColor);
        c4133h61.z.icon = R.drawable.ic_notification;
        c4133h61.g(2, true);
        int i = Build.VERSION.SDK_INT;
        c4133h61.j = 3;
        c4133h61.s = "service";
        C4133h61 c4133h62 = this.e;
        Intrinsics.checkNotNull(c4133h62);
        function1.invoke(c4133h62);
        C4133h61 c4133h63 = this.e;
        Intrinsics.checkNotNull(c4133h63);
        c4133h63.g = p(context, str);
        if (i >= 26) {
            C7282vs.b();
            NotificationChannel notificationChannelA = C4237hd.a(context.getPackageName());
            C7282vs.b();
            NotificationChannel notificationChannelA2 = C7493ws.a(context.getPackageName());
            notificationChannelA.setSound(null, null);
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            notificationChannelA2.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            NotificationManager notificationManager = this.f;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            NotificationManager notificationManager2 = this.f;
            if (notificationManager2 != null) {
                notificationManager2.createNotificationChannel(notificationChannelA2);
            }
            if (z) {
                b();
            }
            if (z) {
                C4133h61 c4133h64 = this.e;
                Intrinsics.checkNotNull(c4133h64);
                c4133h64.w = "bot.trading.112233.sound";
            } else {
                C4133h61 c4133h65 = this.e;
                Intrinsics.checkNotNull(c4133h65);
                c4133h65.w = "bot.trading.112233";
            }
        }
        C4133h61 c4133h66 = this.e;
        Intrinsics.checkNotNull(c4133h66);
        Notification notificationB = c4133h66.b();
        if (i < 26) {
            NotificationManager notificationManager3 = this.f;
            if (notificationManager3 != null) {
                notificationManager3.notify(112233, notificationB);
                return;
            }
            return;
        }
        if (i < 31) {
            NotificationManager notificationManager4 = this.f;
            if (notificationManager4 != null) {
                notificationManager4.notify(112233, notificationB);
                return;
            }
            return;
        }
        try {
            AbstractServiceC7597xN abstractServiceC7597xN = this.d;
            if (abstractServiceC7597xN != null) {
                abstractServiceC7597xN.startForeground(112233, notificationB);
                return;
            }
            NotificationManager notificationManager5 = this.f;
            if (notificationManager5 != null) {
                notificationManager5.notify(112233, notificationB);
            }
        } catch (ForegroundServiceStartNotAllowedException unused) {
            NotificationManager notificationManager6 = this.f;
            if (notificationManager6 != null) {
                notificationManager6.notify(112233, notificationB);
            }
        }
    }

    public final PendingIntent p(Context context, String str) {
        Intent intentPutExtra;
        FV0 fv0 = this.b;
        Intent launchIntentForPackage = fv0.b() == null ? context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()) : new Intent(context, fv0.b());
        if (launchIntentForPackage != null && (intentPutExtra = launchIntentForPackage.putExtra("NOTIFICATION", str)) != null) {
            intentPutExtra.setAction("bot.trading.112233");
        }
        return PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
    }

    public final Bitmap q(String url) {
        Context context = this.a;
        try {
            Resources resources = context.getResources();
            int dimension = (int) resources.getDimension(android.R.dimen.notification_large_icon_width);
            int dimension2 = (int) resources.getDimension(android.R.dimen.notification_large_icon_height);
            KW1 kw1 = C3435dm0.a;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(url, "url");
            C6025ps1<Drawable> c6025ps1R = a.c(context).g().R(url);
            FutureC0932Es1 futureC0932Es1 = new FutureC0932Es1();
            c6025ps1R.M(futureC0932Es1, futureC0932Es1, c6025ps1R, C3387da0.b);
            Object obj = futureC0932Es1.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Drawable drawable = (Drawable) obj;
            return drawable instanceof PictureDrawable ? s((PictureDrawable) drawable, dimension, dimension2) : r(drawable, dimension, dimension2);
        } catch (Exception unused) {
            return null;
        }
    }
}
