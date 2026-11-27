package defpackage;

import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: renamed from: Fn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0994Fn0 {
    public static final String[] f = {"Connection", "Upgrade"};
    public static final String[] g = {"Upgrade", "websocket"};
    public static final String[] h = {"Sec-WebSocket-Version", "13"};
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public ArrayList e;

    public C0994Fn0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        URI.create((z ? "wss" : "ws") + "://" + str2 + str3);
    }
}
