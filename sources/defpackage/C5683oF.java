package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: oF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5683oF implements R90 {
    public static final String i = AS0.d("CommandHandler");
    public final Context d;
    public final HashMap e = new HashMap();
    public final Object g = new Object();
    public final C6344rP1 h;

    public C5683oF(@NonNull Context context, @NonNull C6344rP1 c6344rP1) {
        this.d = context;
        this.h = c6344rP1;
    }

    public static C3429dk2 c(@NonNull Intent intent) {
        return new C3429dk2(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(@NonNull Intent intent, @NonNull C3429dk2 c3429dk2) {
        intent.putExtra("KEY_WORKSPEC_ID", c3429dk2.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c3429dk2.b);
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        synchronized (this.g) {
            try {
                KW kw = (KW) this.e.remove(c3429dk2);
                this.h.b(c3429dk2);
                if (kw != null) {
                    kw.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i2, @NonNull OW1 ow1, @NonNull Intent intent) {
        List<C6135qP1> listC;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AS0 as0C = AS0.c();
            Objects.toString(intent);
            as0C.getClass();
            XK xk = new XK(this.d, i2, ow1);
            ArrayList<Bk2> arrayListI = ow1.i.c.u().i();
            int i3 = ConstraintProxy.a;
            Iterator it = arrayListI.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                VK vk = ((Bk2) it.next()).j;
                z |= vk.d;
                z2 |= vk.b;
                z3 |= vk.e;
                z4 |= vk.a != EnumC4593j41.d;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i4 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = xk.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            Tj2 tj2 = xk.c;
            tj2.b(arrayListI);
            ArrayList<Bk2> arrayList = new ArrayList(arrayListI.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Bk2 bk2 : arrayListI) {
                String str = bk2.a;
                if (jCurrentTimeMillis >= bk2.a() && (!bk2.b() || tj2.a(str))) {
                    arrayList.add(bk2);
                }
            }
            for (Bk2 bk3 : arrayList) {
                String str2 = bk3.a;
                C3429dk2 c3429dk2I = ED.i(bk3);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, c3429dk2I);
                AS0.c().getClass();
                ow1.e.c.execute(new OW1.b(xk.b, ow1, intent3));
            }
            tj2.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            AS0 as0C2 = AS0.c();
            Objects.toString(intent);
            as0C2.getClass();
            ow1.i.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            AS0.c().a(i, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C3429dk2 c3429dk2C = c(intent);
            AS0 as0C3 = AS0.c();
            c3429dk2C.toString();
            as0C3.getClass();
            WorkDatabase workDatabase = ow1.i.c;
            workDatabase.c();
            try {
                Bk2 bk2O = workDatabase.u().o(c3429dk2C.a);
                String str3 = i;
                if (bk2O == null) {
                    AS0.c().e(str3, "Skipping scheduling " + c3429dk2C + " because it's no longer in the DB");
                    return;
                }
                if (bk2O.b.b()) {
                    AS0.c().e(str3, "Skipping scheduling " + c3429dk2C + "because it is finished.");
                    return;
                }
                long jA = bk2O.a();
                boolean zB = bk2O.b();
                Context context2 = this.d;
                if (zB) {
                    AS0 as0C4 = AS0.c();
                    c3429dk2C.toString();
                    as0C4.getClass();
                    C6503s9.b(context2, workDatabase, c3429dk2C, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ow1.e.c.execute(new OW1.b(i2, ow1, intent4));
                } else {
                    AS0 as0C5 = AS0.c();
                    c3429dk2C.toString();
                    as0C5.getClass();
                    C6503s9.b(context2, workDatabase, c3429dk2C, jA);
                }
                workDatabase.n();
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.g) {
                try {
                    C3429dk2 c3429dk2C2 = c(intent);
                    AS0 as0C6 = AS0.c();
                    c3429dk2C2.toString();
                    as0C6.getClass();
                    if (this.e.containsKey(c3429dk2C2)) {
                        AS0 as0C7 = AS0.c();
                        c3429dk2C2.toString();
                        as0C7.getClass();
                    } else {
                        KW kw = new KW(this.d, i2, ow1, this.h.d(c3429dk2C2));
                        this.e.put(c3429dk2C2, kw);
                        kw.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                AS0.c().e(i, "Ignoring intent " + intent);
                return;
            }
            C3429dk2 c3429dk2C3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            AS0 as0C8 = AS0.c();
            intent.toString();
            as0C8.getClass();
            a(c3429dk2C3, z5);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C6344rP1 c6344rP1 = this.h;
        if (zContainsKey) {
            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C6135qP1 c6135qP1B = c6344rP1.b(new C3429dk2(string, i5));
            listC = arrayList2;
            if (c6135qP1B != null) {
                arrayList2.add(c6135qP1B);
                listC = arrayList2;
            }
        } else {
            listC = c6344rP1.c(string);
        }
        for (C6135qP1 c6135qP1 : listC) {
            AS0.c().getClass();
            C4736jk2 c4736jk2 = ow1.i;
            c4736jk2.d.a(new JQ1(c4736jk2, c6135qP1, false));
            WorkDatabase workDatabase2 = ow1.i.c;
            C3429dk2 c3429dk2 = c6135qP1.a;
            int i6 = C6503s9.a;
            VW1 vw1R = workDatabase2.r();
            UW1 uw1B = vw1R.b(c3429dk2);
            if (uw1B != null) {
                C6503s9.a(this.d, c3429dk2, uw1B.c);
                AS0 as0C9 = AS0.c();
                c3429dk2.toString();
                as0C9.getClass();
                vw1R.c(c3429dk2);
            }
            ow1.a(c6135qP1.a, false);
        }
    }
}
