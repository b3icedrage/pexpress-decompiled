package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: uP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6972uP implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }
}
