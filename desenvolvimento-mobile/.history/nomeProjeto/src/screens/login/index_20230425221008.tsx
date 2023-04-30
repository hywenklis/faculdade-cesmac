import * as React from 'react';
import { View, Text, ImageBackground, ImageSourcePropType } from 'react-native';
import imagemFundo from './../../../src/assets/imgs/background.png';

const sourceImagemFundo: ImageSourcePropType = imagemFundo;

export function componente() {
  return (
    <ImageBackground source={sourceImagemFundo} style={{ width: '100%', height: '100%' }}>
      <View>
        <Text>Login Screen</Text>
      </View>
    </ImageBackground>
  );
}

