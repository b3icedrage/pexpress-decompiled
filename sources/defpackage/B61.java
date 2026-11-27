package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class B61 {
    public static String d;
    public static e g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class c implements f {
        public final String a;
        public final int b;
        public final Notification c;

        public c(String str, int i, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = notification;
        }

        @Override // B61.f
        public final void a(InterfaceC2604Zt0 interfaceC2604Zt0) {
            interfaceC2604Zt0.j(this.a, this.b, this.c);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.a);
            sb.append(", id:");
            return SK.b(sb, this.b, ", tag:null]");
        }
    }

    public static class d {
        public final ComponentName a;
        public final IBinder b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    public static class e implements Handler.Callback, ServiceConnection {
        public final Context a;
        public final Handler b;
        public final HashMap c = new HashMap();
        public HashSet d = new HashSet();

        public static class a {
            public final ComponentName a;
            public InterfaceC2604Zt0 c;
            public boolean b = false;
            public final ArrayDeque<f> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public e(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z;
            ArrayDeque<f> arrayDeque;
            boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.a;
            if (zIsLoggable) {
                Objects.toString(componentName);
                aVar.d.size();
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            if (aVar.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean zBindService = context.bindService(component, this, 33);
                aVar.b = zBindService;
                if (zBindService) {
                    aVar.e = 0;
                } else {
                    b0.e("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = aVar.b;
            }
            if (!z || aVar.c == null) {
                b(aVar);
                return;
            }
            while (true) {
                arrayDeque = aVar.d;
                f fVarPeek = arrayDeque.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        fVarPeek.toString();
                    }
                    fVarPeek.a(aVar.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException e) {
                    b0.f("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.b;
            ComponentName componentName = aVar.a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = aVar.e;
            int i2 = i + 1;
            aVar.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                Log.isLoggable("NotifManCompat", 3);
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque<f> arrayDeque = aVar.d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(aVar.e);
            sb.append(" retries");
            b0.e("NotifManCompat", sb.toString());
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            InterfaceC2604Zt0 interfaceC2604Zt0 = null;
            if (i == 0) {
                f fVar = (f) message.obj;
                String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
                synchronized (B61.c) {
                    if (string != null) {
                        try {
                            if (!string.equals(B61.d)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                B61.e = hashSet2;
                                B61.d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = B61.e;
                }
                if (!hashSet.equals(this.d)) {
                    this.d = hashSet;
                    List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet3 = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                b0.e("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet3.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet3) {
                        if (!this.c.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(componentName2);
                            }
                            this.c.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(entry.getKey());
                            }
                            a aVar = (a) entry.getValue();
                            if (aVar.b) {
                                this.a.unbindService(this);
                                aVar.b = false;
                            }
                            aVar.c = null;
                            it.remove();
                        }
                    }
                }
                for (a aVar2 : this.c.values()) {
                    aVar2.d.add(fVar);
                    a(aVar2);
                }
            } else if (i == 1) {
                d dVar = (d) message.obj;
                ComponentName componentName3 = dVar.a;
                IBinder iBinder = dVar.b;
                a aVar3 = (a) this.c.get(componentName3);
                if (aVar3 != null) {
                    int i2 = InterfaceC2604Zt0.a.b;
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2604Zt0.a);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2604Zt0)) {
                            InterfaceC2604Zt0.a.C0209a c0209a = new InterfaceC2604Zt0.a.C0209a();
                            c0209a.b = iBinder;
                            interfaceC2604Zt0 = c0209a;
                        } else {
                            interfaceC2604Zt0 = (InterfaceC2604Zt0) iInterfaceQueryLocalInterface;
                        }
                    }
                    aVar3.c = interfaceC2604Zt0;
                    aVar3.e = 0;
                    a(aVar3);
                    return true;
                }
            } else if (i == 2) {
                a aVar4 = (a) this.c.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.b) {
                        this.a.unbindService(this);
                        aVar4.b = false;
                    }
                    aVar4.c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                a aVar5 = (a) this.c.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.b.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface f {
        void a(InterfaceC2604Zt0 interfaceC2604Zt0);
    }

    public B61(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, @NonNull Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        c cVar = new c(this.a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new e(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, cVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}
