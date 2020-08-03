/*
 * Copyright (c) 2020, Shashank Verma <shashank.verma2002@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.alpha.dev.flip_to_shush.appService;

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.alpha.dev.flip_to_shush.PreferenceHelper
import com.alpha.dev.flip_to_shush.SERVICE_STARTED

class StopServiceAction : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        context.stopService(Intent(context, FlipService::class.java))
        PreferenceHelper(context).putBoolean(SERVICE_STARTED, false)
    }
}
