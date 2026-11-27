package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: m61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5234m61 {
    public final Context a;
    public final Notification.Builder b;
    public final C4133h61 c;
    public final Bundle d;
    public final int e;

    /* JADX INFO: renamed from: m61$a */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: m61$b */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: m61$c */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: m61$d */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: m61$e */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: renamed from: m61$f */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: renamed from: m61$g */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: m61$h */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public C5234m61(C4133h61 c4133h61) {
        ArrayList<C7440wd1> arrayList;
        Bundle[] bundleArr;
        int i;
        ArrayList<String> arrayList2;
        boolean z = true;
        new ArrayList();
        this.d = new Bundle();
        this.c = c4133h61;
        Context context = c4133h61.a;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = e.a(context, c4133h61.w);
        } else {
            this.b = new Notification.Builder(c4133h61.a);
        }
        Notification notification = c4133h61.z;
        Resources resources = null;
        int i2 = 2;
        int i3 = 0;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c4133h61.e).setContentText(c4133h61.f).setContentInfo(null).setContentIntent(c4133h61.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0).setNumber(c4133h61.i).setProgress(c4133h61.m, c4133h61.n, c4133h61.o);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = c4133h61.h;
        c.b(builder, iconCompat == null ? null : IconCompat.a.f(iconCompat, context));
        this.b.setSubText(null).setUsesChronometer(false).setPriority(c4133h61.j);
        AbstractC5021l61 abstractC5021l61 = c4133h61.l;
        if (abstractC5021l61 instanceof C4343i61) {
            C4343i61 c4343i61 = (C4343i61) abstractC5021l61;
            int color = C6333rM.getColor(c4343i61.a.a, R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c4343i61.a.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = c4343i61.a.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            IconCompat iconCompatB = IconCompat.b(context2.getResources(), context2.getPackageName(), 2131231125);
            Bundle bundle = new Bundle();
            CharSequence charSequenceC = C4133h61.c(spannableStringBuilder);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            C3503e61 c3503e61 = new C3503e61(iconCompatB, charSequenceC, null, bundle, arrayList4.isEmpty() ? null : (C7281vr1[]) arrayList4.toArray(new C7281vr1[arrayList4.size()]), arrayList3.isEmpty() ? null : (C7281vr1[]) arrayList3.toArray(new C7281vr1[arrayList3.size()]));
            c3503e61.a.putBoolean("key_action_priority", true);
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(c3503e61);
            ArrayList<C3503e61> arrayList6 = c4343i61.a.b;
            if (arrayList6 != null) {
                for (C3503e61 c3503e62 : arrayList6) {
                    c3503e62.getClass();
                    if (!c3503e62.a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList5.add(c3503e62);
                        i2--;
                    }
                }
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                a((C3503e61) it.next());
            }
        } else {
            Iterator<C3503e61> it2 = c4133h61.b.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
        Bundle bundle2 = c4133h61.t;
        if (bundle2 != null) {
            this.d.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        this.b.setShowWhen(c4133h61.k);
        a.i(this.b, c4133h61.r);
        a.g(this.b, c4133h61.p);
        a.j(this.b, null);
        a.h(this.b, c4133h61.q);
        this.e = c4133h61.x;
        b.b(this.b, c4133h61.s);
        b.c(this.b, c4133h61.u);
        b.f(this.b, c4133h61.v);
        b.d(this.b, null);
        b.e(this.b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList7 = c4133h61.A;
        ArrayList<C7440wd1> arrayList8 = c4133h61.c;
        String str = "";
        if (i4 < 28) {
            if (arrayList8 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>(arrayList8.size());
                for (C7440wd1 c7440wd1 : arrayList8) {
                    String str2 = c7440wd1.c;
                    if (str2 == null) {
                        CharSequence charSequence = c7440wd1.a;
                        str2 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str2);
                }
            }
            if (arrayList2 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList2;
                } else {
                    C0903Ej c0903Ej = new C0903Ej(arrayList7.size() + arrayList2.size());
                    c0903Ej.addAll(arrayList2);
                    c0903Ej.addAll(arrayList7);
                    arrayList7 = new ArrayList<>(c0903Ej);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator<String> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                b.a(this.b, it3.next());
            }
        }
        ArrayList<C3503e61> arrayList9 = c4133h61.d;
        if (arrayList9.size() > 0) {
            if (c4133h61.t == null) {
                c4133h61.t = new Bundle();
            }
            Bundle bundle3 = c4133h61.t.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList9.size()) {
                String string = Integer.toString(i5);
                boolean z2 = z;
                C3503e61 c3503e63 = arrayList9.get(i5);
                Bundle bundle6 = new Bundle();
                if (c3503e63.b == null && (i = c3503e63.f) != 0) {
                    c3503e63.b = IconCompat.b(resources, str, i);
                }
                IconCompat iconCompat2 = c3503e63.b;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.c() : i3);
                bundle6.putCharSequence("title", c3503e63.g);
                bundle6.putParcelable("actionIntent", c3503e63.h);
                Bundle bundle7 = c3503e63.a;
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", c3503e63.d);
                bundle6.putBundle("extras", bundle8);
                C7281vr1[] c7281vr1Arr = c3503e63.c;
                if (c7281vr1Arr == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[c7281vr1Arr.length];
                    int i6 = 0;
                    while (i6 < c7281vr1Arr.length) {
                        C7281vr1 c7281vr1 = c7281vr1Arr[i6];
                        int i7 = i6;
                        Bundle bundle9 = new Bundle();
                        c7281vr1.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr[i7] = bundle9;
                        i6 = i7 + 1;
                        str = str;
                        c7281vr1Arr = c7281vr1Arr;
                    }
                }
                String str3 = str;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c3503e63.e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i5++;
                z = z2;
                arrayList9 = arrayList9;
                arrayList8 = arrayList8;
                str = str3;
                resources = null;
                i3 = 0;
            }
            arrayList = arrayList8;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c4133h61.t == null) {
                c4133h61.t = new Bundle();
            }
            c4133h61.t.putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList8;
        }
        int i8 = Build.VERSION.SDK_INT;
        this.b.setExtras(c4133h61.t);
        d.e(this.b, null);
        if (i8 >= 26) {
            e.b(this.b, 0);
            e.e(this.b, null);
            e.f(this.b, null);
            e.g(this.b, 0L);
            e.d(this.b, c4133h61.x);
            if (!TextUtils.isEmpty(c4133h61.w)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            for (C7440wd1 c7440wd2 : arrayList) {
                Notification.Builder builder2 = this.b;
                c7440wd2.getClass();
                f.a(builder2, C7440wd1.a.b(c7440wd2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(this.b, c4133h61.y);
            g.b(this.b, null);
        }
    }

    public final void a(C3503e61 c3503e61) {
        int i;
        if (c3503e61.b == null && (i = c3503e61.f) != 0) {
            c3503e61.b = IconCompat.b(null, "", i);
        }
        IconCompat iconCompat = c3503e61.b;
        Notification.Action.Builder builderA = c.a(iconCompat != null ? IconCompat.a.f(iconCompat, null) : null, c3503e61.g, c3503e61.h);
        C7281vr1[] c7281vr1Arr = c3503e61.c;
        if (c7281vr1Arr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[c7281vr1Arr.length];
            for (int i2 = 0; i2 < c7281vr1Arr.length; i2++) {
                c7281vr1Arr[i2].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    C7281vr1.a.b(builderAddExtras, 0);
                }
                remoteInputArr[i2] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = c3503e61.a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = c3503e61.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i3 = Build.VERSION.SDK_INT;
        d.a(builderA, z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            f.b(builderA, 0);
        }
        if (i3 >= 29) {
            g.c(builderA, false);
        }
        if (i3 >= 31) {
            h.a(builderA, false);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", c3503e61.e);
        a.b(builderA, bundle2);
        a.a(this.b, a.d(builderA));
    }
}
