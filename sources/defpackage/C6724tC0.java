package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: tC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6724tC0 extends IOException {
    public boolean d;

    /* JADX INFO: renamed from: tC0$a */
    public static class a extends C6724tC0 {
    }

    public static C6724tC0 a() {
        return new C6724tC0("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C6724tC0 c() {
        return new C6724tC0("CodedInputStream encountered a malformed varint.");
    }

    public static C6724tC0 d() {
        return new C6724tC0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C6724tC0 e() {
        return new C6724tC0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
