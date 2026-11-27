package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0850Dr0 implements Comparable<C0850Dr0> {

    @NotNull
    public static final C0850Dr0 g;

    @NotNull
    public static final C0850Dr0 h;

    @NotNull
    public static final C0850Dr0 i;

    @NotNull
    public static final C0850Dr0 j;

    @NotNull
    public static final C0850Dr0 k;

    @NotNull
    public static final List<C0850Dr0> l;
    public final int d;

    @NotNull
    public final String e;

    static {
        C0850Dr0 c0850Dr0 = new C0850Dr0(100, "Continue");
        C0850Dr0 c0850Dr1 = new C0850Dr0(101, "Switching Protocols");
        C0850Dr0 c0850Dr2 = new C0850Dr0(102, "Processing");
        C0850Dr0 c0850Dr3 = new C0850Dr0(HttpPlatformResponse.MAX_MESSAGE_LENGTH, Payload.RESPONSE_OK);
        C0850Dr0 c0850Dr4 = new C0850Dr0(201, "Created");
        C0850Dr0 c0850Dr5 = new C0850Dr0(202, "Accepted");
        C0850Dr0 c0850Dr6 = new C0850Dr0(203, "Non-Authoritative Information");
        C0850Dr0 c0850Dr7 = new C0850Dr0(204, "No Content");
        C0850Dr0 c0850Dr8 = new C0850Dr0(205, "Reset Content");
        C0850Dr0 c0850Dr9 = new C0850Dr0(206, "Partial Content");
        C0850Dr0 c0850Dr10 = new C0850Dr0(207, "Multi-Status");
        C0850Dr0 c0850Dr11 = new C0850Dr0(300, "Multiple Choices");
        C0850Dr0 c0850Dr12 = new C0850Dr0(301, "Moved Permanently");
        g = c0850Dr12;
        C0850Dr0 c0850Dr13 = new C0850Dr0(302, "Found");
        h = c0850Dr13;
        C0850Dr0 c0850Dr14 = new C0850Dr0(303, "See Other");
        i = c0850Dr14;
        C0850Dr0 c0850Dr15 = new C0850Dr0(304, "Not Modified");
        C0850Dr0 c0850Dr16 = new C0850Dr0(305, "Use Proxy");
        C0850Dr0 c0850Dr17 = new C0850Dr0(306, "Switch Proxy");
        C0850Dr0 c0850Dr18 = new C0850Dr0(307, "Temporary Redirect");
        j = c0850Dr18;
        C0850Dr0 c0850Dr19 = new C0850Dr0(308, "Permanent Redirect");
        k = c0850Dr19;
        List<C0850Dr0> listF = WE.f(c0850Dr0, c0850Dr1, c0850Dr2, c0850Dr3, c0850Dr4, c0850Dr5, c0850Dr6, c0850Dr7, c0850Dr8, c0850Dr9, c0850Dr10, c0850Dr11, c0850Dr12, c0850Dr13, c0850Dr14, c0850Dr15, c0850Dr16, c0850Dr17, c0850Dr18, c0850Dr19, new C0850Dr0(400, "Bad Request"), new C0850Dr0(401, "Unauthorized"), new C0850Dr0(402, "Payment Required"), new C0850Dr0(403, "Forbidden"), new C0850Dr0(404, "Not Found"), new C0850Dr0(405, "Method Not Allowed"), new C0850Dr0(406, "Not Acceptable"), new C0850Dr0(407, "Proxy Authentication Required"), new C0850Dr0(408, "Request Timeout"), new C0850Dr0(409, "Conflict"), new C0850Dr0(410, "Gone"), new C0850Dr0(411, "Length Required"), new C0850Dr0(412, "Precondition Failed"), new C0850Dr0(413, "Payload Too Large"), new C0850Dr0(414, "Request-URI Too Long"), new C0850Dr0(415, "Unsupported Media Type"), new C0850Dr0(416, "Requested Range Not Satisfiable"), new C0850Dr0(417, "Expectation Failed"), new C0850Dr0(422, "Unprocessable Entity"), new C0850Dr0(423, "Locked"), new C0850Dr0(424, "Failed Dependency"), new C0850Dr0(425, "Too Early"), new C0850Dr0(426, "Upgrade Required"), new C0850Dr0(429, "Too Many Requests"), new C0850Dr0(431, "Request Header Fields Too Large"), new C0850Dr0(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, "Internal Server Error"), new C0850Dr0(501, "Not Implemented"), new C0850Dr0(502, "Bad Gateway"), new C0850Dr0(503, "Service Unavailable"), new C0850Dr0(504, "Gateway Timeout"), new C0850Dr0(505, "HTTP Version Not Supported"), new C0850Dr0(506, "Variant Also Negotiates"), new C0850Dr0(507, "Insufficient Storage"));
        l = listF;
        int iA = OW0.a(XE.m(listF, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : listF) {
            linkedHashMap.put(Integer.valueOf(((C0850Dr0) obj).d), obj);
        }
    }

    public C0850Dr0(int i2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.d = i2;
        this.e = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0850Dr0 c0850Dr0) {
        C0850Dr0 other = c0850Dr0;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d - other.d;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0850Dr0) && ((C0850Dr0) obj).d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        return this.d + ' ' + this.e;
    }
}
