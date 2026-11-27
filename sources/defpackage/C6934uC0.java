package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: uC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6934uC0 extends IOException {

    /* JADX INFO: renamed from: uC0$a */
    public static class a extends C6934uC0 {
    }

    public static a a() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C6934uC0 b() {
        return new C6934uC0("Failed to parse the message.");
    }

    public static C6934uC0 c() {
        return new C6934uC0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
