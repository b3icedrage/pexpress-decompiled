package io.sentry.logger;

import defpackage.AbstractC3118cG1;
import defpackage.C2688aH1;
import defpackage.C4401iO1;
import defpackage.C4533ip0;
import defpackage.C5364mj1;
import defpackage.EK;
import defpackage.InterfaceC1015Fu0;
import defpackage.InterfaceC2347Wu0;
import defpackage.NG1;
import defpackage.PG1;
import defpackage.QG1;
import defpackage.RD1;
import defpackage.SF1;
import defpackage.SG1;
import defpackage.TF1;
import io.sentry.protocol.F;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.util.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b {

    @NotNull
    public final RD1 a;

    public e(@NotNull RD1 rd1) {
        this.a = rd1;
    }

    @Override // io.sentry.logger.b
    public final void a(@NotNull SG1 sg1, @NotNull i iVar, @Nullable String str, @Nullable Object... objArr) {
        String str2;
        RD1 rd1 = this.a;
        C2688aH1 c2688aH1P = rd1.p();
        InterfaceC1015Fu0 interfaceC1015Fu0 = rd1.e;
        try {
            if (!rd1.isEnabled()) {
                c2688aH1P.getLogger().a(NG1.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!c2688aH1P.getLogs().a) {
                c2688aH1P.getLogger().a(NG1.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            AbstractC3118cG1 abstractC3118cG1Now = c2688aH1P.getDateProvider().now();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th) {
                    rd1.p().getLogger().d(NG1.ERROR, "Error while running log through String.format", th);
                    str2 = str;
                }
            }
            C5364mj1 c5364mj1Y = interfaceC1015Fu0.y();
            InterfaceC2347Wu0 interfaceC2347Wu0E = interfaceC1015Fu0.e();
            if (interfaceC2347Wu0E == null) {
                interfaceC1015Fu0.M(new z(interfaceC1015Fu0, c2688aH1P));
            }
            u uVar = interfaceC2347Wu0E == null ? c5364mj1Y.a : interfaceC2347Wu0E.w().d;
            C4401iO1 c4401iO1 = interfaceC2347Wu0E == null ? c5364mj1Y.b : interfaceC2347Wu0E.w().e;
            PG1 pg1 = new PG1(uVar, Double.valueOf(abstractC3118cG1Now.i() / 1.0E9d), str2, sg1);
            pg1.e = c4401iO1;
            pg1.k = b(iVar, str, objArr);
            pg1.j = Integer.valueOf(sg1.getSeverityNumber());
            interfaceC1015Fu0.A().b(pg1, interfaceC1015Fu0);
        } catch (Throwable th2) {
            c2688aH1P.getLogger().d(NG1.ERROR, "Error while capturing log event", th2);
        }
    }

    @NotNull
    public final HashMap<String, QG1> b(@NotNull i iVar, @NotNull String str, @Nullable Object... objArr) {
        HashMap<String, QG1> map = new HashMap<>();
        RD1 rd1 = this.a;
        Iterator it = ((ConcurrentHashMap) rd1.e.q()).values().iterator();
        while (it.hasNext()) {
            ((SF1) it.next()).getClass();
            map.put(null, new QG1(TF1.inferFrom(null), (Object) null));
        }
        String str2 = iVar.a;
        if (!"manual".equalsIgnoreCase(str2)) {
            map.put("sentry.origin", new QG1(TF1.STRING, str2));
        }
        int i = 0;
        for (Object obj : objArr) {
            map.put(EK.e(i, "sentry.message.parameter."), new QG1(TF1.inferFrom(obj), obj));
            i++;
        }
        if (i > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new QG1(TF1.STRING, str));
        }
        r sdkVersion = rd1.p().getSdkVersion();
        if (sdkVersion != null) {
            TF1 tf1 = TF1.STRING;
            map.put("sentry.sdk.name", new QG1(tf1, sdkVersion.d));
            map.put("sentry.sdk.version", new QG1(tf1.apiName(), sdkVersion.e));
        }
        String environment = rd1.p().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new QG1(TF1.STRING, environment));
        }
        u uVarK = rd1.e.k();
        u uVar = u.e;
        if (uVar.equals(uVarK)) {
            u uVarK2 = rd1.p().getReplayController().k();
            if (!uVar.equals(uVarK2)) {
                map.put("sentry.replay_id", new QG1(TF1.STRING, uVarK2.toString()));
                map.put("sentry._internal.replay_is_buffering", new QG1(TF1.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new QG1(TF1.STRING, uVarK.toString()));
        }
        String release = rd1.p().getRelease();
        if (release != null) {
            map.put("sentry.release", new QG1(TF1.STRING, release));
        }
        if (!io.sentry.util.r.a) {
            C2688aH1 c2688aH1P = rd1.p();
            String serverName = c2688aH1P.getServerName();
            if (serverName != null) {
                map.put("server.address", new QG1(TF1.STRING, serverName));
            } else if (c2688aH1P.isAttachServerName()) {
                C4533ip0 c4533ip0A = C4533ip0.a();
                if (c4533ip0A.c < System.currentTimeMillis() && c4533ip0A.d.compareAndSet(false, true)) {
                    c4533ip0A.b();
                }
                String str3 = c4533ip0A.b;
                if (str3 != null) {
                    map.put("server.address", new QG1(TF1.STRING, str3));
                }
            }
        }
        F user = rd1.e.getUser();
        if (user == null) {
            String distinctId = rd1.p().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new QG1(TF1.STRING, distinctId));
                return map;
            }
        } else {
            String str4 = user.e;
            if (str4 != null) {
                map.put("user.id", new QG1(TF1.STRING, str4));
            }
            String str5 = user.g;
            if (str5 != null) {
                map.put("user.name", new QG1(TF1.STRING, str5));
            }
            String str6 = user.d;
            if (str6 != null) {
                map.put("user.email", new QG1(TF1.STRING, str6));
            }
        }
        return map;
    }
}
