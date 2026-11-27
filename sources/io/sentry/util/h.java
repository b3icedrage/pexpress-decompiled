package io.sentry.util;

import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C0928Er0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final List<String> a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    public static final List<String> b = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
    public static final C0928Er0 c = new C0928Er0(400, 499);
    public static final C0928Er0 d = new C0928Er0(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 599);
}
