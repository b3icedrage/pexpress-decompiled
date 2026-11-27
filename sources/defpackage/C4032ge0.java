package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: renamed from: ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4032ge0 extends AbstractC5550nd1 {
    public static final C6170qb c = C6170qb.d();
    public final V31 a;
    public final Context b;

    public C4032ge0(V31 v31, Context context) {
        this.b = context;
        this.a = v31;
    }

    @Override // defpackage.AbstractC5550nd1
    public final boolean a() {
        URI uriCreate;
        V31 v31 = this.a;
        String strT = v31.T();
        boolean zIsEmpty = strT == null ? true : strT.trim().isEmpty();
        C6170qb c6170qb = c;
        if (zIsEmpty) {
            c6170qb.f("URL is missing:" + v31.T());
            return false;
        }
        String strT2 = v31.T();
        if (strT2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strT2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                c6170qb.g("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            c6170qb.f("URL cannot be parsed");
            return false;
        }
        Context context = this.b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            C6170qb.d().a();
            if (Cm2.e == null) {
                Cm2.e = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = Cm2.e;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        c6170qb.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            c6170qb.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            c6170qb.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            c6170qb.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            c6170qb.f("URL port is less than or equal to 0");
            return false;
        }
        V31.c cVarL = v31.V() ? v31.L() : null;
        if (cVarL == null || cVarL == V31.c.HTTP_METHOD_UNKNOWN) {
            c6170qb.f("HTTP Method is null or invalid: " + v31.L());
            return false;
        }
        if (v31.W() && v31.M() <= 0) {
            c6170qb.f("HTTP ResponseCode is a negative value:" + v31.M());
            return false;
        }
        if (v31.X() && v31.O() < 0) {
            c6170qb.f("Request Payload is a negative value:" + v31.O());
            return false;
        }
        if (v31.Y() && v31.P() < 0) {
            c6170qb.f("Response Payload is a negative value:" + v31.P());
            return false;
        }
        if (!v31.U() || v31.J() <= 0) {
            c6170qb.f("Start time of the request is null, or zero, or a negative value:" + v31.J());
            return false;
        }
        if (v31.Z() && v31.Q() < 0) {
            c6170qb.f("Time to complete the request is a negative value:" + v31.Q());
            return false;
        }
        if (v31.b0() && v31.S() < 0) {
            c6170qb.f("Time from the start of the request to the start of the response is null or a negative value:" + v31.S());
            return false;
        }
        if (!v31.a0() || v31.R() <= 0) {
            c6170qb.f("Time from the start of the request to the end of the response is null, negative or zero:" + v31.R());
            return false;
        }
        if (v31.W()) {
            return true;
        }
        c6170qb.f("Did not receive a HTTP Response Code");
        return false;
    }
}
