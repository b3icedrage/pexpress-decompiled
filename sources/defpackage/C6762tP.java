package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: tP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6762tP implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
