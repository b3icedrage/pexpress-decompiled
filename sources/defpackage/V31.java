package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V31 extends AbstractC0595Ak0<V31, a> implements JZ0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final V31 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC5966pc1<V31> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C7204vW0<String, String> customAttributes_ = C7204vW0.e;
    private String url_ = "";
    private String responseContentType_ = "";
    private XB0.c<C5970pd1> perfSessions_ = C0752Ck1.h;

    public static final class a extends AbstractC0595Ak0.a<V31, a> implements JZ0 {
        public a() {
            super(V31.DEFAULT_INSTANCE);
        }
    }

    public static final class b {
        public static final C6574sW0<String, String> a;

        static {
            EnumC7044uj2.a aVar = EnumC7044uj2.h;
            a = new C6574sW0<>(aVar, aVar, "");
        }
    }

    public enum c implements XB0.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public final int d;

        public static final class a {
            public static final a a = new a();
        }

        c(int i) {
            this.d = i;
        }

        @Override // XB0.a
        public final int getNumber() {
            return this.d;
        }
    }

    static {
        V31 v31 = new V31();
        DEFAULT_INSTANCE = v31;
        AbstractC0595Ak0.u(V31.class, v31);
    }

    public static void A(V31 v31) {
        v31.bitField0_ &= -65;
        v31.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void B(V31 v31, long j) {
        v31.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
        v31.clientStartTimeUs_ = j;
    }

    public static void C(V31 v31, long j) {
        v31.bitField0_ |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        v31.timeToRequestCompletedUs_ = j;
    }

    public static void D(V31 v31, long j) {
        v31.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
        v31.timeToResponseInitiatedUs_ = j;
    }

    public static void E(V31 v31, long j) {
        v31.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
        v31.timeToResponseCompletedUs_ = j;
    }

    public static void F(V31 v31, List list) {
        XB0.c<C5970pd1> cVar = v31.perfSessions_;
        if (!cVar.v()) {
            v31.perfSessions_ = AbstractC0595Ak0.t(cVar);
        }
        G0.c(list, v31.perfSessions_);
    }

    public static void G(V31 v31, c cVar) {
        v31.getClass();
        v31.httpMethod_ = cVar.d;
        v31.bitField0_ |= 2;
    }

    public static void H(V31 v31, long j) {
        v31.bitField0_ |= 4;
        v31.requestPayloadBytes_ = j;
    }

    public static void I(V31 v31, long j) {
        v31.bitField0_ |= 8;
        v31.responsePayloadBytes_ = j;
    }

    public static V31 K() {
        return DEFAULT_INSTANCE;
    }

    public static a c0() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(V31 v31, String str) {
        v31.getClass();
        str.getClass();
        v31.bitField0_ |= 1;
        v31.url_ = str;
    }

    public static void x(V31 v31) {
        v31.getClass();
        v31.networkClientErrorReason_ = 1;
        v31.bitField0_ |= 16;
    }

    public static void y(V31 v31, int i) {
        v31.bitField0_ |= 32;
        v31.httpResponseCode_ = i;
    }

    public static void z(V31 v31, String str) {
        v31.getClass();
        str.getClass();
        v31.bitField0_ |= 64;
        v31.responseContentType_ = str;
    }

    public final long J() {
        return this.clientStartTimeUs_;
    }

    public final c L() {
        c cVar;
        switch (this.httpMethod_) {
            case 0:
                cVar = c.HTTP_METHOD_UNKNOWN;
                break;
            case 1:
                cVar = c.GET;
                break;
            case 2:
                cVar = c.PUT;
                break;
            case 3:
                cVar = c.POST;
                break;
            case 4:
                cVar = c.DELETE;
                break;
            case 5:
                cVar = c.HEAD;
                break;
            case 6:
                cVar = c.PATCH;
                break;
            case 7:
                cVar = c.OPTIONS;
                break;
            case 8:
                cVar = c.TRACE;
                break;
            case 9:
                cVar = c.CONNECT;
                break;
            default:
                cVar = null;
                break;
        }
        return cVar == null ? c.HTTP_METHOD_UNKNOWN : cVar;
    }

    public final int M() {
        return this.httpResponseCode_;
    }

    public final XB0.c N() {
        return this.perfSessions_;
    }

    public final long O() {
        return this.requestPayloadBytes_;
    }

    public final long P() {
        return this.responsePayloadBytes_;
    }

    public final long Q() {
        return this.timeToRequestCompletedUs_;
    }

    public final long R() {
        return this.timeToResponseCompletedUs_;
    }

    public final long S() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String T() {
        return this.url_;
    }

    public final boolean U() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean Z() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
    }

    public final boolean a0() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    public final boolean b0() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    @Override // defpackage.AbstractC0595Ak0
    public final Object q(AbstractC0595Ak0.e eVar) {
        InterfaceC5966pc1 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", c.a.a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C3787fU.l, "customAttributes_", b.a, "perfSessions_", C5970pd1.class});
            case 3:
                return new V31();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<V31> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (V31.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0595Ak0.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
