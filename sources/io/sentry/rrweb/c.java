package io.sentry.rrweb;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements BH0 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class a implements KG0<c> {
        @Override // defpackage.KG0
        @NotNull
        public final c a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return c.values()[q71.E0()];
        }
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).f(ordinal());
    }
}
